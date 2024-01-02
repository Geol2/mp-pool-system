package com.bicns.backend.index;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Tag(name = "예제 API", description = "Swagger 테스트용 API")
@Controller
public class IndexController {

    @GetMapping("/")
    public String index() {
        return "helloWorld";
    }
}
