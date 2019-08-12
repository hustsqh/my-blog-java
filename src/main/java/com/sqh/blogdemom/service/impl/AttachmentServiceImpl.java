package com.sqh.blogdemom.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sqh.blogdemom.mapper.generator.AttachmentMapper;
import com.sqh.blogdemom.model.domain.Attachment;
import com.sqh.blogdemom.service.AttachmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional(rollbackFor = RuntimeException.class)
public class AttachmentServiceImpl implements AttachmentService {
    private static final String ATTACHMENTS_CACHE_NAME = "attachements";
    
    @Autowired
    private AttachmentMapper attachmentMapper;
    
    @Override
    @CacheEvict(value = ATTACHMENTS_CACHE_NAME, allEntries = true, beforeInvocation = true)
    public void save(Attachment attachment) throws Exception {
        attachmentMapper.insert(attachment);
    }

    @Override
    @Cacheable(value = ATTACHMENTS_CACHE_NAME, key = "'getAttachment'+#page+#limit")
    public PageInfo<Attachment> getAttachment(int page, int limit) {
        PageHelper.startPage(page, limit);
        
        //todo: select example?
        return null;
    }

    @Override
    @Cacheable(value = ATTACHMENTS_CACHE_NAME, key = "'findById'+#id")
    public Attachment findById(int id) {
        return attachmentMapper.selectByPrimaryKey(id);
    }

    @Override
    @Cacheable(value = ATTACHMENTS_CACHE_NAME, key = "'countAttachment'")
    public List<Attachment> countAttachment() {
        return null;
    }
}
