package com.waa.labtwo.repo;

import com.waa.labtwo.entity.Comment;
import org.springframework.data.repository.CrudRepository;

public interface CommentRepo extends CrudRepository<Comment,Long> {
}
