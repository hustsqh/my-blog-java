package com.sqh.blogdemom.service;

import com.github.pagehelper.PageInfo;
import com.sqh.blogdemom.model.domain.Theme;

public interface ThemeService {
    PageInfo<Theme> findPageTheme(int page, int limit);
    void saveTheme(Theme theme);
    void remove(int id);
    Theme findByThemeName(String themeName);
    void themeEnabled(int id);
    String getEnabledTheme();
}
