package com.waa.labtwo.service.impl;

import com.waa.labtwo.entity.Comment;
import com.waa.labtwo.repo.CommentRepo;
import com.waa.labtwo.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    CommentRepo commentRepo;

    @Override
    public void save(Comment comment) {
       commentRepo.save(comment);
    }

    @Override
    public void delete(long id) {
        commentRepo.deleteById(id);

    }

    @Override
    public Comment getById(long id) {
        return commentRepo.findById(id).get();
    }

    @Override
    public List<Comment> findAll() {
        return (List<Comment>) commentRepo.findAll();
    }
}
