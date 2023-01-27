package com.waa.labtwo.repo;

import com.waa.labtwo.entity.Post;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PostRepo extends CrudRepository<Post, Long> {

    @Query("select  p from Post p where p.title=:param")
    public List<Post> getPosts(String param);




}
