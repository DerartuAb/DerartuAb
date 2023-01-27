package com.waa.labtwo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
//try it with public record Post (long id,String title,String content,String author);
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String content;
    private String author;
@ManyToOne(cascade = CascadeType.MERGE)
@JsonBackReference
    private Users user;
    //many additional attribute.....

    @OneToMany(cascade ={CascadeType.MERGE, CascadeType.REMOVE}, fetch = FetchType.LAZY)//(mappedBy = "user_id") // @OneToMany
    @JsonManagedReference
    @Fetch(FetchMode.JOIN)
    @BatchSize(size = 1)
    @JoinColumn(name = "post_id")
    List<Comment> comments;
}
