package com.waa.labtwo.service.impl;

import com.waa.labtwo.entity.Post;
//import com.waa.labtwo.helper.ListMapper;
import com.waa.labtwo.repo.PostRepo;
import com.waa.labtwo.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {
    @Autowired
    private PostRepo postRepo;


    //``````````````````````````````````````````````````````````````````````````````````````````````````````````````
    // With out DTO implementation
    //``````````````````````````````````````````````````````````````````````````````````````````````````````````````
    @Override
    public void save(Post p) {
        postRepo.save(p);
    }

    @Override
    public void delete(long id) {
        postRepo.deleteById(id);
    }

// @Override
// public void update(long id, Post p) {
//  postRepo.update(id,p);
// }

    @Override
    public Post getById(long id) {
        return postRepo.findById(id).orElse(null);
    }
    @Override
    public List<Post> findAll(){
     return (List<Post>) postRepo.findAll();
    }


}
