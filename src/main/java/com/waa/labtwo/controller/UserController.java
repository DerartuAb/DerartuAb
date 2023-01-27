package com.waa.labtwo.controller;

import com.waa.labtwo.aspect.ExecutionTime;
import com.waa.labtwo.entity.Comment;
import com.waa.labtwo.entity.Post;
import com.waa.labtwo.entity.Users;
import com.waa.labtwo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
@CrossOrigin(origins = {"http://localhost:8080"})
public class UserController {
//    @Autowired
//    UserDTOService userDTOService;
    private UserService userService;

//    @ResponseStatus(HttpStatus.CREATED)
//    @PostMapping("/dto")
//    public void save(@RequestBody UserDto p) {
//        userDTOService.save(p);
//    }
//
//    @ResponseStatus(HttpStatus.NO_CONTENT)
//    @DeleteMapping("dto/{id}")
//    public void deleteDto(@PathVariable long id) {
//        userDTOService.delete(id);
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

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public void save(@RequestBody Users users) {
        userService.save(users);
    }

    @ExecutionTime
    @GetMapping("/{id}")
    public ResponseEntity<Users> getById(@PathVariable long id)throws Exception {
        if(5<7)
            throw new Exception("Something wrong");
        var user = userService.getById(id);
        return ResponseEntity.ok(user);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {
        userService.delete(id);
    }

    @GetMapping("/filter")
    public List<Users> findPostGreaterThan(@RequestParam(value="n") Integer n) {
        return userService.find(n);
    }
    @GetMapping
    public List<Users> findAllUsers() {
        return userService.findAll();
    }
    @GetMapping("/{id}/posts")
    public List<Post> singleUserPosts(@PathVariable long id) {
       return userService.getById(id).getPosts();

    }
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @GetMapping("/{id1}/posts/{id2}/comments/{id3}")
    public Comment findCommentByUserPost(@PathVariable long id1, @PathVariable long id2 , @PathVariable long id3) {
        return userService.findCommentByUserPost(id1,id2,id3);
    }

}
