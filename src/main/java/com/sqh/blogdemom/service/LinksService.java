package com.sqh.blogdemom.service;

import com.sqh.blogdemom.model.domain.Link;

import java.util.List;

public interface LinksService {
    List<Link> findLinks();

    Link findByLinkId(int linkId);

    void save(Link link) throws Exception;

    void update(Link link);

    void remove(int linkId);
}
