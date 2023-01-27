package com.waa.labtwo.controller;

import com.waa.labtwo.entity.Post;
import com.waa.labtwo.entity.Users;
import com.waa.labtwo.service.PostService;
import com.waa.labtwo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/admin")
public class AdminController {
@Autowired
    private UserService userService;
    PostService postService;

    @Autowired
    public AdminController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping
    public List<Post> findAllUsers() {
        return postService.findAll();
    }

    @GetMapping("/all")
    public List<Users> findAllUsers2() {
        return userService.findAll();
    }
}
