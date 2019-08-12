package com.sqh.blogdemom.service;

import com.sqh.blogdemom.model.domain.Options;

import java.util.List;
import java.util.Map;

public interface OptionsService {
    void save(Map<String, String> map) throws Exception;
    List<Options> selectMap();
    void saveOption(String key, String value);
    void delete(Options options) throws Exception;
}
