package com.sqh.blogdemom.service;

import com.github.pagehelper.PageInfo;
import com.sqh.blogdemom.model.domain.Log;

public interface LogService {
    void save(Log log);

    PageInfo<Log> findLogs(int page, int limit);

    void clear();
}
