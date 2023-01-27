package com.waa.labtwo.controller;

import com.waa.labtwo.entity.Comment;
import com.waa.labtwo.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/comments")
@CrossOrigin(origins = {"http://localhost:8080"})
public class CommentController {
    @Autowired
    private CommentService commentService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public void save(@RequestBody Comment comment) {
        commentService.save(comment);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Comment> getById(@PathVariable long id) {
        var comment = commentService.getById(id);
        return ResponseEntity.ok(comment);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {
        commentService.delete(id);
    }

    @GetMapping
    public List<Comment> findAllUsers() {
        return commentService.findAll();
    }

}
