package com.waa.labtwo.entity;

import lombok.Data;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Data
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String role;

//    @ManyToMany(mappedBy = "roles")
//    List<Users> users;
}
