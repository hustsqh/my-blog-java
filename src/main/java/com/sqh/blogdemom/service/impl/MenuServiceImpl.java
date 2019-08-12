package com.sqh.blogdemom.service.impl;

import com.sqh.blogdemom.mapper.generator.MenuMapper;
import com.sqh.blogdemom.model.domain.Menu;
import com.sqh.blogdemom.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = RuntimeException.class)
public class MenuServiceImpl implements MenuService {
    
    @Autowired
    private MenuMapper menuMapper;
    
    @Override
    public List<Menu> findMenus() {
        return null;
    }

    @Override
    public Menu findByMenuId(Integer menuId) {
        return menuMapper.selectByPrimaryKey(menuId);
    }

    @Override
    public void save(Menu menu) {
        menuMapper.insert(menu);
    }

    @Override
    public void edit(Menu menu) {
        menuMapper.updateByKeySelective(menu);
    }

    @Override
    public void remove(Integer menuId) {
        menuMapper.deleteByKey(menuId);
    }
}
