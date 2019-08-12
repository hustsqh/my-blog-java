package com.sqh.blogdemom.mapper.generator;

import com.sqh.blogdemom.model.domain.Attachment;

public interface AttachmentMapper {
    int insert(Attachment attachment);
    Attachment selectByPrimaryKey(int id);
}
