/*
 * @(#)PostManager.java  2015. 07. 06
 *
 * Copyright(c) 2015 JoonHo Son.
 */

package com.test.valueup.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.test.valueup.dao.PostDao;
import com.test.valueup.dto.Post;

/**
 * PostManager
 * <p/>
 * Post manager.
 *
 * @author JoonHo Son
 * @version 1.0.0 2015. 07. 06
 * @since 1.0.0
 */
@Service("postManager")
public class PostManager {
    /**
     * Post dao
     *
     * @see PostDao
     */
    @Autowired
    private PostDao dao;

    /**
     * 포스트 목록 조회
     *
     * @return 포스트 목록
     */
    public List<Post> getPostList() {
        return dao.getPostList();
    }

    /**
     * 포스트 등록/수정 처리
     * <p/>
     * 포스트의 시퀀스(일련번호)가 존재할 경우 수정 처리. 없을 경우에는 신규 등록 처리.
     *
     * @param post 포스트
     */
    @Transactional
    public void savePost(Post post) {
        if (post.getId() == null) {
            dao.insertPost(post);
        } else {
            dao.updatePost(post);
        }
    }

    /**
     * 포스트 상세 조회
     *
     * @param postId 포스트 시퀀스
     *
     * @return 포스트
     */
    public Post getPost(Long postId) {
        return dao.getPost(postId);
    }

    /**
     * 포스트 삭제
     *
     * @param postId 포스트 시퀀스
     */
    public void deletePost(Long postId) {
        dao.deletePost(postId);

        // TODO: 댓글 삭제 추가
    }
}
