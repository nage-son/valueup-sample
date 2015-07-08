/*
 * @(#)Post.java  2015. 07. 06
 *
 * Copyright(c) 2015 JoonHo Son.
 */

package com.test.valueup.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.test.valueup.dto.Post;
import com.test.valueup.dto.Result;
import com.test.valueup.service.PostManager;

/**
 * PostController
 *
 * @author JoonHo Son
 * @version 1.0.0 2015. 07. 06
 * @since 1.0.0
 */
@RestController("postController")
@RequestMapping(value = "/post")
public class PostController {
    @Autowired
    private PostManager manager;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public Result getPostList() {
        List<Post> postList;
        Result result = new Result();

        try {
            postList = manager.getPostList();

            result.setResult("ok");
            result.setData(postList);
        } catch (Exception e) {
            e.printStackTrace();

            result.setResult("fail");
        }

        return result;
    }

    @RequestMapping(method = RequestMethod.POST)
    public Result insertPost(Post post) {
        Result result = new Result();

        try {
            manager.savePost(post);

            result.setResult("ok");
        } catch (Exception e) {
            e.printStackTrace();

            result.setResult("fail");
        }

        return result;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Result getPost(@PathVariable(value = "id") Long id) {
        Result result = new Result();

        try {
            Post post = manager.getPost(id);

            result.setResult("ok");
            result.setData(post);
        } catch (Exception e) {
            e.printStackTrace();

            result.setResult("fail");
        }

        return result;
    }
}
