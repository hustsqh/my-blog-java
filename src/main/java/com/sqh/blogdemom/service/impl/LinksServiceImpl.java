package com.sqh.blogdemom.service.impl;

import com.sqh.blogdemom.mapper.generator.LinkMapper;
import com.sqh.blogdemom.model.domain.Link;
import com.sqh.blogdemom.service.LinksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional(rollbackFor = RuntimeException.class)
public class LinksServiceImpl implements LinksService {
    @Autowired
    private LinkMapper linkMapper;
    
    @Override
    public List<Link> findLinks() {
        return null;
    }

    @Override
    public Link findByLinkId(int linkId) {
        return linkMapper.selectByPrimaryKey(linkId);
    }

    @Override
    public void save(Link link) throws Exception {
        linkMapper.insert(link);
    }

    @Override
    public void update(Link link) {
        linkMapper.updateByKeySelective(link);
    }

    @Override
    public void remove(int linkId) {
        linkMapper.deleteByKey(linkId);
    }
}
