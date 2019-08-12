package com.sqh.blogdemom.service.impl;

import cn.hutool.core.util.StrUtil;
import com.sqh.blogdemom.mapper.generator.OptionsMapper;
import com.sqh.blogdemom.model.domain.Options;
import com.sqh.blogdemom.service.OptionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional(rollbackFor = RuntimeException.class)
public class OptionsServiceImpl implements OptionsService {
    @Autowired
    private OptionsMapper optionsMapper;
    
    @Override
    public void save(Map<String, String> map) throws Exception {
        if (null != map && !map.isEmpty()){
            map.forEach((k,v) -> saveOption(k,v));
        }
    }

    @Override
    public List<Options> selectMap() {
        return optionsMapper.getAllOptions();
    }

    @Override
    public void saveOption(String key, String value) {
        Options options = optionsMapper.getOptionsByKey(key);
        if (options == null){
            options = new Options();
            options.setOptionName(key);
            options.setOptionValue(value);
            optionsMapper.insert(options);
        }else {
            options.setOptionValue(value);
            optionsMapper.updateOptions(options);
        }
    }

    @Override
    public void delete(Options options) throws Exception {
        optionsMapper.removeOptions(options.getOptionName());
    }
}
