/*
 * @(#)CommentManager.java  2015. 07. 09
 *
 * Copyright(c) 2015 JoonHo Son.
 */

package com.test.valueup.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.test.valueup.dao.CommentDao;
import com.test.valueup.dto.Comment;

/**
 * CommentManager
 *
 * @author JoonHo Son
 * @version 1.0.0 2015. 07. 09
 * @since 1.0.0
 */
@Service(value = "commentManager")
public class CommentManager {
    @Autowired
    private CommentDao dao;

    public List<Comment> getCommentList(Long postId) {
        return dao.getCommentList(postId);
    }

    @Transactional
    public void saveComment(Comment comment) {
        // insert comment
        dao.insertComment(comment);
    }
}
