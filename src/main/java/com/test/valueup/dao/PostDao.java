/*
 * @(#)PostDao.java  2015. 07. 06
 *
 * Copyright(c) 2015 JoonHo Son.
 */

package com.test.valueup.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.test.valueup.dto.Post;

/**
 * PostDao
 *
 * @author JoonHo Son
 * @version 1.0.0 2015. 07. 06
 * @since 1.0.0
 */
@Repository("postDao")
public interface PostDao {
    /**
     * Get post list.
     *
     * @return post list
     */
    List<Post> getPostList();

    /**
     * Get detail of post.
     *
     * @param id post sequence
     *
     * @return post
     */
    Post getPost(Long id);

    /**
     * Add post
     *
     * @param post post
     */
    void insertPost(Post post);

    /**
     * Update post
     *
     * @param post post
     */
    void updatePost(Post post);
}
