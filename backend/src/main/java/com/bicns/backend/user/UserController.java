package com.bicns.backend.user;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedHashMap;

@Controller
public class UserController {

    @PostMapping("/user")
    @CrossOrigin(origins = "http://localhost:5173")
    public ResponseEntity<String> postUser(@RequestBody LinkedHashMap<String, String> dto) {
        System.out.println(dto.get("userId") + ", " + dto.get("password"));
        return new ResponseEntity<>("ok", HttpStatus.OK);
    }

    @GetMapping("/user")
    public String getUser() {
       System.out.println(1111);
        return "user";
    }
}
