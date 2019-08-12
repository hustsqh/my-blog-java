package com.sqh.blogdemom.web.controller.admin;


import com.github.pagehelper.PageInfo;
import com.sqh.blogdemom.model.domain.Article;
import com.sqh.blogdemom.model.domain.Log;
import com.sqh.blogdemom.model.domain.PageParam;
import com.sqh.blogdemom.model.domain.User;
import com.sqh.blogdemom.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/admin/api")
public class AdminController extends BaseController {
    @Autowired
    private CategoryService categoryService;
    
    @Autowired
    private ArticleService articleService;
    
    @Autowired
    private OptionsService optionsService;
    
    @Autowired
    private SiteService siteService;
    
    @Autowired
    private LogService logService;
    
    @GetMapping("/logs")
    @ResponseBody
    public PageInfo<Log> getLogs(PageParam pageParam){
        return logService.findLogs(pageParam.getPage(), pageParam.getLimit());
    }
    
    @PostMapping("/page/delete/:aid")
    @ResponseBody
    public void   deletePage(@PathVariable(value = "aid") int aid) throws Exception {
        articleService.remove(aid);
    }
    
    @GetMapping("/articles/:aid")
    @ResponseBody
    public Article getArticle(@PathVariable(value = "aid") int aid) {
        return articleService.findArticleId(aid);
    }
    
    @GetMapping("/articles/content/:cid")
    @ResponseBody
    public String getArticleContent(@PathVariable(value = "aid") int aid){
        Article article = articleService.findArticleId(aid);
        return article.getArticleContent();
    }
    
    @PostMapping("/article/new")
    @ResponseBody
    public int newArticle(Article article) {
        
    }
    
    
}
