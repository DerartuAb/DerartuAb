//package com.waa.labtwo.service.impl;
//
//import com.waa.labtwo.dto.PostDto;
//import com.waa.labtwo.entity.Post;
//import com.waa.labtwo.helper.ListMapper;
//import com.waa.labtwo.repo.PostRepo;
//import com.waa.labtwo.service.PostDTOService;
//import org.modelmapper.ModelMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service
//public class PostDTOServiceImpl implements PostDTOService {
//    @Autowired
//    private PostRepo postRepo;
//    @Autowired
//    ModelMapper modelMapper;
//    @Autowired
//    ListMapper<Post, PostDto> listMapperPostToDto;
//
//    @Override
//    public void save(PostDto p) {
//        postRepo.save(modelMapper.map(p, Post.class));
//    }
//
//    @Override
//    public void delete(long id) {
//        postRepo.deleteById(id);
//    }
//
////    @Override
////    public void update(long id, PostDto p) {
////        postRepo.update(id, modelMapper.map(p, Post.class));
////    }
//
//    @Override
//    public PostDto getById(long id) {
//        return modelMapper.map(postRepo.findById(id), PostDto.class);
//    }
//
////    @Override
////    public List<PostDto> findAll() { //List<Post>
////
////        // return postRepo.findAll();
//////  return postRepo.findAll()
//////          .stream()
//////          .map(this::convertPostToDTO)
//////          .collect(Collectors.toList());
////        return (List<PostDto>) listMapperPostToDto.mapList(postRepo.findAll(), new PostDto());
////    }
//
//    //    private PostDto convertPostToDTO(Post post) {
////        PostDto postDto = new PostDto();
////        postDto.setId(post.getId());
////        postDto.setContent(post.getContent());
////        postDto.setAuthor(post.getAuthor());
////        return postDto;
////    }
//}
