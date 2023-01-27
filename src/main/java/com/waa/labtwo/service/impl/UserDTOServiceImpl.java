//package com.waa.labtwo.service.impl;
//
//import com.waa.labtwo.dto.PostDto;
//import com.waa.labtwo.dto.UserDto;
//import com.waa.labtwo.entity.Post;
//import com.waa.labtwo.entity.Users;
//import com.waa.labtwo.helper.ListMapper;
//import com.waa.labtwo.repo.PostRepo;
//import com.waa.labtwo.repo.UserRepo;
//import com.waa.labtwo.service.UserDTOService;
//import org.apache.catalina.User;
//import org.modelmapper.ModelMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service
//public class UserDTOServiceImpl implements UserDTOService {
//    @Autowired
//    private UserRepo userRepo;
//    @Autowired
//    ModelMapper modelMapper;
//    @Autowired
//    ListMapper<Users, UserDto> listMapperUserToDto;
//
//    @Override
//    public void save(UserDto userDto) {
//        userRepo.save(modelMapper.map(userDto, Users.class));
//    }
//
//    @Override
//    public void delete(long id) {
//        userRepo.deleteById(id);
//    }
//
////    @Override
////    public void update(long id, UserDto userDto) {
////        userRepo.update(id, modelMapper.map(userDto, Users.class));
////    }
//
//    @Override
//    public UserDto getById(long id) {
//        return modelMapper.map(userRepo.findById(id), UserDto.class);
//    }
//
////    @Override
////    public List<UserDto> findAll() {
////
////        // return userRepo.findAll();
//////  return userRepo.findAll()
//////          .stream()
//////          .map(this::convertUserToDTO)
//////          .collect(Collectors.toList());
////        return (List<PostDto>) listMapperPostToDto.mapList(postRepo.findAll(), new PostDto());
////    }
//
//    //    private PostDto convertUserToDTO(Users users) {
////        UserDto userDto = new UserDto();
////        userDto.setId(users.getId());
////        userDto.setContent(users.getContent());
////        userDto.setAuthor(users.getAuthor());
////        return userDto;
////    }
//}
