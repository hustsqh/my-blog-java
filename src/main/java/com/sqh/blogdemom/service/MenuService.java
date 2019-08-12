package com.sqh.blogdemom.service;

import com.sqh.blogdemom.model.domain.Menu;

import java.util.List;

public interface MenuService {
    List<Menu> findMenus();

    Menu findByMenuId(Integer menuId);

    void save(Menu menu);

    void edit(Menu menu);

    void remove(Integer menuId);
}
