package com.sqh.blogdemom.model.dto;

import com.sqh.blogdemom.model.domain.Menu;
import com.sqh.blogdemom.web.controller.admin.AdminController;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SystemConst {
    public static final String USER_SESSION_KEY = "user_session";
    public static final int MAX_PAGE = 100;
    public static Map<String, String> OPTIONS = new HashMap<>();
    public static List<Menu> MENUS = new ArrayList<>();
    public static String THEME_NAME;
    public static final Integer IP_REPEAT_TIME = 600;
    public static final int CLICK_EXCEED = 10;
    
    public static final String CLASSPATH = new File(AdminController.class.getResource("/").getPath()).getPath()+File.separator;
}
