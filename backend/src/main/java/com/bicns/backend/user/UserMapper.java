package com.bicns.backend.user;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    UserVO selectByUserId(UserVO user);
}
