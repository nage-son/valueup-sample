/*
 * @(#)Comment.java  2015. 07. 06
 *
 * Copyright(c) 2015 JoonHo Son.
 */

package com.test.valueup.dto;

import java.io.Serializable;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;

/**
 * Comment
 *
 * @author JoonHo Son
 * @version 1.0.0 2015. 07. 06
 * @since 1.0.0
 */
@Getter
@Setter
public class Comment implements Serializable {
    /**
     * Serial version uid.
     */
    private static final long serialVersionUID = -4602235451751624147L;

    /**
     * Sequence
     */
    private Long id;

    /**
     * Post sequence
     */
    private Long postId;

    /**
     * Comment content
     */
    private String content;

    /**
     * Created date
     */
    private Date createdAt;
}
