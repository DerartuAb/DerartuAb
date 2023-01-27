package com.waa.labtwo.service;

import com.waa.labtwo.dto.PostDto;

public interface PostDTOService {
    public void save(PostDto p);

    public void delete(long id);

    //public void update(long id, PostDto p);

    public PostDto getById(long id);

   // public List<PostDto> findAll(); //List<Post>
}
