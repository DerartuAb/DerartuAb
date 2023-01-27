package com.waa.labtwo.service;

import com.waa.labtwo.entity.Comment;

import java.util.List;

public interface CommentService {
    //public List<Comment> findAll();

    public void save(Comment p);

    public void delete(long id);

    //    public void update(long id, Post p);
    public Comment getById(long id);
    public List<Comment> findAll();
}
