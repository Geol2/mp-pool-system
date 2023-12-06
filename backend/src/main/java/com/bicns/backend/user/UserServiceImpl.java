package com.bicns.backend.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    UserMapper userMapper;

    UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public UserVO getOneUserByUserId(UserVO userVO) {
        UserVO vo = new UserVO();
        try {
            vo = userMapper.selectByUserId(userVO);
            return vo;
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return vo;
    }
}
