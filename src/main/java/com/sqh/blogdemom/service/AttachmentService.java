package com.sqh.blogdemom.service;

import com.github.pagehelper.PageInfo;
import com.sqh.blogdemom.model.domain.Attachment;

import java.util.List;

public interface AttachmentService {
    void save(Attachment attachment) throws Exception;

    PageInfo<Attachment> getAttachment(int page, int limit);

    Attachment findById(int id);

    List<Attachment> countAttachment();
}
