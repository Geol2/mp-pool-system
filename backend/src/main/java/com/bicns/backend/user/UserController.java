package com.bicns.backend.user;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    UserService userService;

    UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/user")
    @ResponseBody
    @CrossOrigin(origins = "${env.frontend}")
    public ResponseEntity<UserVO> postUser(@RequestBody LoginDTO dto) {
        System.out.println(dto.getUserId() + ", " + dto.getUserPwd());

        UserVO userVO = new UserVO();
        userVO.setUserId(dto.getUserId());
        userVO.setUserPwd(dto.getUserPwd());

        UserVO returnUser = userService.getOneUserByUserId(userVO);

        return new ResponseEntity<>(returnUser, HttpStatus.OK);
    }

    @GetMapping("/user")
    public String getUser() {
       System.out.println(1111);
        return "user";
    }
}
