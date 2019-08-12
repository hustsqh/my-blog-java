package com.sqh.blogdemom.service.impl;

import com.github.pagehelper.PageInfo;
import com.sqh.blogdemom.model.domain.Comment;

import java.util.List;

public interface CommentService {
    void setComment(Comment comment);
    void delete(Integer coid, Integer aid);
    PageInfo<Comment> getComments(Integer aid, int page, int limit);
    long getCommentClout(Integer aid);
    List<Comment> getChildren(Integer coid);
    PageInfo<Comment> findComments()
}
