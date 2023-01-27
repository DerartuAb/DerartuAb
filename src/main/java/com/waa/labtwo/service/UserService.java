package com.waa.labtwo.service;

import com.waa.labtwo.entity.Comment;
import com.waa.labtwo.entity.Post;
import com.waa.labtwo.entity.Users;

import java.util.List;

public interface UserService {

    public void save(Users p);

    public void delete(long id);

    //    public void update(long id, Post p);
    public Users getById(long id);
    public List<Users> findAll();
    //public List<Users> findAllByPostsGreaterThan(Integer n);

    List<Post> findAllById(Long id);

    public List<Users> find(Integer n); //findAllByPostsGreaterThan


    public List<Users> findAllByPostsByTitleEquals(String name);

    public Comment findCommentByUserPost(Long a, Long b, Long c);
}
