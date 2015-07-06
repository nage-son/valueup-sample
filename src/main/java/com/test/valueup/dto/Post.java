/*
 * @(#)Post.java  2015. 07. 06
 *
 * Copyright(c) 2015 JoonHo Son.
 */

package com.test.valueup.dto;

import java.io.Serializable;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;

/**
 * Post
 *
 * @author JoonHo Son
 * @version 1.0.0 2015. 07. 06
 * @since 1.0.0
 */
@Getter
@Setter
public class Post implements Serializable {
    /**
     * Serial version uid.
     */
    private static final long serialVersionUID = 6347958058731202317L;

    /**
     * Sequence
     */
    private Long id;

    /**
     * Title
     */
    private String title;

    /**
     * Post content
     */
    private String content;

    /**
     * Created date
     */
    private Date createdAt;

    /**
     * Updated date
     */
    private Date updatedAt;
}
