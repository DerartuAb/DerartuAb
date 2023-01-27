package com.waa.labtwo.controller;

import com.waa.labtwo.entity.Post;
import com.waa.labtwo.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/posts")
@CrossOrigin(origins = {"http://localhost:8080"})
public class PostController {
//    @Autowired
//    PostDTOService postDTOService;
    PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

    //``````````````````````````````````````````````````````````````````````````````````````````````````````````````
    // DTO implementation
    //``````````````````````````````````````````````````````````````````````````````````````````````````````````````

//    @ResponseStatus(HttpStatus.CREATED)
//    @PostMapping("/dto")
//    public void save(@RequestBody PostDto p) {
//        postDTOService.save(p);
//    }
//
//    @ResponseStatus(HttpStatus.NO_CONTENT)
//    @DeleteMapping("dto/{id}")
//    public void deleteDto(@PathVariable long id) {
//        postDTOService.delete(id);
//    }
//
//    @PutMapping("/{id}")
//    public void update(@PathVariable("id") long id, @RequestBody PostDto p) {
//        postService.update(id, p);
//    }
//    @ResponseStatus(HttpStatus.OK)
//    @GetMapping
//    public List<PostDto> getAll() {
//        return postService.findAll();
//    }
//    @GetMapping("/{id}")
//    public ResponseEntity<PostDto> getById(@PathVariable long id) {
//        var post = postService.getById(id);
//        return ResponseEntity.ok(post);
//    }

    // ``````````````````````````````````````````````````````````````````````````````````````````````````````````````
    // With out DTO implementation
    //``````````````````````````````````````````````````````````````````````````````````````````````````````````````
//    @ResponseStatus(HttpStatus.OK)
//    @GetMapping
//    public List<Post> getAll(){ //List<Post>
//        return postService.findAll();
//    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public void save(@RequestBody Post p) {
        postService.save(p);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Post> getById(@PathVariable long id) {
        var post = postService.getById(id);
        return ResponseEntity.ok(post);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {
        postService.delete(id);
    }

    @GetMapping
    public List<Post> findAllUsers() {
        return postService.findAll();
    }

    @GetMapping("/admin")
    public List<Post> findAllUsersUsingAdmin() {
        return postService.findAll();
    }

//    @PutMapping("/{id}")
//    public void update(@PathVariable("id") long id, @RequestBody Post p) {
//        postService.update(id,p);
//    }
//    //``````````````````````````````````````````````````````````````````````````````````````````````````````````````

}
