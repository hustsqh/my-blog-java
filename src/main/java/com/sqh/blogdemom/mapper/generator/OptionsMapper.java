package com.sqh.blogdemom.mapper.generator;

import com.sqh.blogdemom.model.domain.Options;

import java.util.List;

public interface OptionsMapper {
    int insert(Options options);
    Options getOptionsByKey(String key);
    List<Options> getAllOptions();
    int updateOptions(Options options);
    int removeOptions(String key);
}
