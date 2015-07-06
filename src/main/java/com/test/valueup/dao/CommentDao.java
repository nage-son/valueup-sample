/*
 * @(#)CommentDao.java  2015. 07. 06
 *
 * Copyright(c) 2015 JoonHo Son.
 */

package com.test.valueup.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.test.valueup.dto.Comment;

/**
 * CommentDao
 *
 * @author JoonHo Son
 * @version 1.0.0 2015. 07. 06
 * @since 1.0.0
 */
@Repository("commentDao")
public interface CommentDao {
    /**
     * Get comment list.
     *
     * @return comment list by post
     */
    List<Comment> getCommentList();

    /**
     * Add comment
     *
     * @param comment comment
     */
    void insertComment(Comment comment);
}
