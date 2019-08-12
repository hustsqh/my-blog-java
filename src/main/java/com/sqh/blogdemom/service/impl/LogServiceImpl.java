package com.sqh.blogdemom.service.impl;

import com.github.pagehelper.PageInfo;
import com.sqh.blogdemom.mapper.custom.LogMapperCustom;
import com.sqh.blogdemom.mapper.generator.LogMapper;
import com.sqh.blogdemom.model.domain.Log;
import com.sqh.blogdemom.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = RuntimeException.class)
public class LogServiceImpl implements LogService {
    
    @Autowired
    private LogMapper logMapper;
    
    @Autowired
    private LogMapperCustom logMapperCustom;

    @Override
    public void save(Log log) {
        logMapper.insert(log);
    }

    @Override
    public PageInfo<Log> findLogs(int page, int limit) {
        return null;
    }

    @Override
    public void clear() {
        logMapperCustom.clear();
    }
}
