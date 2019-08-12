package com.sqh.blogdemom.service.impl;

import com.google.common.hash.Hashing;
import com.sqh.blogdemom.model.domain.*;
import com.sqh.blogdemom.model.dto.ArchiveBo;
import com.sqh.blogdemom.service.SiteService;
import com.sqh.blogdemom.util.MapCache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.security.MessageDigest;
import java.util.List;
import java.util.Map;

@Service
@Transactional(rollbackFor = RuntimeException.class)
public class SiteServiceImpl implements SiteService {
    
    @Autowired
    private CommentService commentService;
    
    public MapCache mapCache = new MapCache();
    
    @Override
    public void initSite(User users) {
        String pwd = Hashing.md5().hashBytes((users.getUserName() + users.getUserPwd()).getBytes()).toString();
        
        
    }

    @Override
    public List<Comment> recentComments(int limit) {
        return null;
    }

    @Override
    public List<Article> getAritcles(String type, int limit) {
        return null;
    }

    @Override
    public Statistics getStatistics() {
        return null;
    }

    @Override
    public List<ArchiveBo> getArchives() {
        return null;
    }

    @Override
    public Comment getComment(Integer coid) {
        return null;
    }

    @Override
    public BackResponse backup(String bkType, String bkPath, String fmt) throws Exception {
        return null;
    }
}
