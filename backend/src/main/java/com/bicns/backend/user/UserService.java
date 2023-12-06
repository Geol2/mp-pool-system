package com.bicns.backend.user;

import org.springframework.stereotype.Service;

@Service
public interface UserService {

    UserVO getOneUserByUserId(UserVO userVO);
}
