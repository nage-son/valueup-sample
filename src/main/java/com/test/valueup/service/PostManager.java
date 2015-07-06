/*
 * @(#)PostManager.java  2015. 07. 06
 *
 * Copyright(c) 2015 JoonHo Son.
 */

package com.test.valueup.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.valueup.dao.PostDao;
import com.test.valueup.dto.Post;

/**
 * PostManager
 *
 * @author JoonHo Son
 * @version 1.0.0 2015. 07. 06
 * @since 1.0.0
 */
@Service("postManager")
public class PostManager {
    @Autowired
    private PostDao dao;

    public List<Post> getPostList() {
        return dao.getPostList();
    }
}
