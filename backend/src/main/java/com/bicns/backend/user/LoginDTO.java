package com.bicns.backend.user;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginDTO {
    private String userId;

    private String userPwd;
}
