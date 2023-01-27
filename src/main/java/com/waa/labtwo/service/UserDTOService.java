package com.waa.labtwo.service;

import com.waa.labtwo.dto.UserDto;

public interface UserDTOService {
    public void save(UserDto userDto);

    public void delete(long id);

    //public void update(long id, UserDto userDto);

    public UserDto getById(long id);

    // public List<UserDto> findAll();
}
