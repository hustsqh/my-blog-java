package com.sqh.blogdemom.service;

import com.sqh.blogdemom.model.domain.*;
import com.sqh.blogdemom.model.dto.ArchiveBo;

import java.util.List;

public interface SiteService {
    void initSite(User users);
    List<Comment> recentComments(int limit);
    List<Article> getAritcles(String type, int limit);
    Statistics getStatistics();
    List<ArchiveBo> getArchives();
    Comment getComment(Integer coid);
    BackResponse backup(String bkType, String bkPath, String fmt) throws Exception;
}
