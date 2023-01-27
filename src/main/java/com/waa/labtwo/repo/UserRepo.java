package com.waa.labtwo.repo;

import com.waa.labtwo.entity.Comment;
import com.waa.labtwo.entity.Post;
import com.waa.labtwo.entity.Users;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepo extends CrudRepository<Users, Long> {
    List<Post> findAllById(Long id);
    @Query("SELECT users FROM Users users WHERE size(users.posts) >:n")
    public List<Users> find(Integer n); //findAllByPostsGreaterThan

    @Query("SELECT u  FROM Users u join u.posts p WHERE p.title = :name")
    public List<Users> findAllByPostsByTitleEquals(String name);

//    @Query("select u from  Users  u join u.posts p where  p.size>:n")
//    public List<Users> findA(int n);

    @Query("select c from Comment c join c.post p join p.user u where u.id= :a and p.id=:b and c.id =:c")
    public Comment findCommentByUserPost(Long a, Long b, Long c);

    Users findByEmail(String email);
}
