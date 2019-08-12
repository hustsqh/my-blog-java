package com.sqh.blogdemom.service.impl;

import com.github.pagehelper.PageInfo;
import com.sqh.blogdemom.model.domain.Theme;
import com.sqh.blogdemom.service.ThemeService;
import org.springframework.stereotype.Service;

@Service
public class ThemeServiceImpl implements ThemeService {
    @Override
    public PageInfo<Theme> findPageTheme(int page, int limit) {
        return null;
    }

    @Override
    public void saveTheme(Theme theme) {

    }

    @Override
    public void remove(int id) {

    }

    @Override
    public Theme findByThemeName(String themeName) {
        return null;
    }

    @Override
    public void themeEnabled(int id) {

    }

    @Override
    public String getEnabledTheme() {
        return null;
    }
}
