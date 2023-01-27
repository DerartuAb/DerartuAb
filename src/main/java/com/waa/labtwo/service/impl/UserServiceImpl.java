package com.waa.labtwo.service.impl;

import com.waa.labtwo.entity.Comment;
import com.waa.labtwo.entity.Post;
import com.waa.labtwo.entity.Users;
import com.waa.labtwo.repo.UserRepo;
import com.waa.labtwo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepo userRepo;

    @Override
    public void save(Users users) {
        userRepo.save(users);
    }

    @Override
    public void delete(long id) {
        userRepo.deleteById(id);
    }

// @Override
// public void update(long id, Post p) {
//  postRepo.update(id,p);
// }

    @Override
    public Users getById(long id) {
        return userRepo.findById(id).orElse(null); //.get()
    }

    @Override
    public List<Users> findAll() {
        return (List<Users>) userRepo.findAll();
    }

//    @Override
//    public List<Users> findAllByPostsGreaterThan(Integer n) {
//        return userRepo.find(n);
//    }
    @Override
    public List<Post> findAllById(Long id) {
        return userRepo.findAllById(id);
    }

    @Override
    public List<Users> find(Integer n) {
        return userRepo.find(n);
    }
//
//    @Override
//    public List<Users> findAllByPostsGreaterThan(Integer n) {
//        return userRepo.findAllByPostsGreaterThan(n);
//    }

    @Override
    public List<Users> findAllByPostsByTitleEquals(String name) {
        return userRepo.findAllByPostsByTitleEquals(name);
    }

    @Override
    public Comment findCommentByUserPost(Long a, Long b, Long c) {
        return userRepo.findCommentByUserPost(a,b,c);
    }
}
