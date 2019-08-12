package com.sqh.blogdemom.web.controller.admin;

import com.sqh.blogdemom.model.domain.User;
import com.sqh.blogdemom.service.LogService;
import com.sqh.blogdemom.util.MapCache;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;

public class BaseController {
    protected final Logger log = LoggerFactory.getLogger(getClass());
    
    @Autowired
    protected LogService logService;
    
    protected MapCache cache = MapCache.single();
    public static String THEME = "hello";
    
    public String render(String viewName){
        return THEME + "/" + viewName;   
    }
    
    public String render_404(){
        return "/comm/error_404";
    }

    public User user() {
        return TaleUtils.getLoginUser();
    }

    public Integer getUid(){
        return this.user().getUserId();
    }
    
}
