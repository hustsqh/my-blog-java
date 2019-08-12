package com.sqh.blogdemom.config;

import com.sqh.blogdemom.model.domain.Options;
import com.sqh.blogdemom.model.dto.SystemConst;
import com.sqh.blogdemom.service.MenuService;
import com.sqh.blogdemom.service.OptionsService;
import com.sqh.blogdemom.service.ThemeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ContextRefreshedEvent;

import java.util.List;

/**
 * @author :
 */

@Configuration
public class StartupConfig implements ApplicationListener<ContextRefreshedEvent> {
    @Autowired
    private OptionsService optionsService;
    
    @Autowired
    private MenuService menuService;
    
    @Autowired
    private ThemeService themeService;
    
    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        
    }
    
    private void loadOptions(){
        List<Options> list = optionsService.selectMap();
        if (list.size() > 0){
            for (Options options:list){
                SystemConst.OPTIONS.put(options.getOptionName(), options.getOptionValue())
            }
        }
    }
    
    private void loadMenus(){
        SystemConst.MENUS = menuService.findMenus();
    }
    
    private void loadThemeName(){
        SystemConst.THEME_NAME = themeService.getEnabledTheme();
    }
}

