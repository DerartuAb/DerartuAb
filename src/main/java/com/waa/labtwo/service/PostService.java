package com.waa.labtwo.service;

import com.waa.labtwo.entity.Post;

import java.util.List;

public interface PostService {
    //``````````````````````````````````````````````````````````````````````````````````````````````````````````````
    // DTO implementation
    //``````````````````````````````````````````````````````````````````````````````````````````````````````````````

//    public void save(PostDto p);
//
//    public void delete(long id);
//
//    public void update(long id, PostDto p);
//
//    public PostDto getById(long id);
//
//    public List<PostDto> findAll(); //List<Post>

    //``````````````````````````````````````````````````````````````````````````````````````````````````````````````
    // With out DTO implementation
    //``````````````````````````````````````````````````````````````````````````````````````````````````````````````
    public List<Post> findAll();

    public void save(Post p);

    public void delete(long id);

//        public void update(long id, Post p);
    public Post getById(long id);
}
