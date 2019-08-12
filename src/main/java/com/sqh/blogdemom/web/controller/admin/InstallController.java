package com.sqh.blogdemom.web.controller.admin;

import cn.hutool.core.util.StrUtil;
import com.sqh.blogdemom.model.domain.Options;
import com.sqh.blogdemom.model.domain.User;
import com.sqh.blogdemom.model.dto.JsonResult;
import com.sqh.blogdemom.model.dto.SystemConst;
import com.sqh.blogdemom.model.param.InstallParam;
import com.sqh.blogdemom.service.ArticleService;
import com.sqh.blogdemom.service.MenuService;
import com.sqh.blogdemom.service.OptionsService;
import com.sqh.blogdemom.service.UserService;
import com.sqh.blogdemom.util.Misc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static com.sqh.blogdemom.model.dto.SystemConst.CLASSPATH;
import static com.sqh.blogdemom.model.dto.SystemConst.OPTIONS;

@Controller
@RequestMapping(value = "/install")
public class InstallController extends BaseController{
    @Autowired
    private UserService userService;
    
    @Autowired
    private ArticleService articleService;
    
    @Autowired
    private MenuService menuService;
    
    @Autowired
    private OptionsService optionsService;
    
    @GetMapping
    public String install(Model model) {
        if (StrUtil.equals("true", SystemConst.OPTIONS.get("is_install"))){
            model.addAttribute("is_install", true);
        }else {
            model.addAttribute("is_install", false);
        }
        return "install";
    }
    
    @PostMapping(produces = "application/json;charset=UTF-8")
    public JsonResult doInstall(@RequestBody @Validated InstallParam installParam, BindingResult bindingResult) throws Exception{
        if (isRepeatInstall()){
            return new JsonResult(false, "repeat install");
        }
        User user = new User();
        user.setUserDisplayName(installParam.getAdminUser());
        user.setUserName(installParam.getAdminUser());
        user.setUserPwd(installParam.getAdminPwd());
        user.setUserEmail(installParam.getAdminEmail());
        userService.save(user);

        Map<String, String> op = new HashMap<>();
        op.put("site_title", installParam.getSiteTitle());
        op.put("site_url", Misc.buildURL(installParam.getSiteUrl()));

        optionsService.save(op);
        
        return new JsonResult(true, "succ");
    }
    
    private boolean isRepeatInstall(){
        return Files.exists(Paths.get(CLASSPATH + "install.lock")) 
                && StrUtil.equals(OPTIONS.get("allow_install"), "1");
    }
}
