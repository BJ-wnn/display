package com.wnn.display.controller;

import com.wnn.display.mvc.ResponseResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * @author NanNan Wang
 **/
@RestController
@ResponseResult
public class ResponseResultDemo {

    @GetMapping("/hello")
    public String demoResponse() {
        return "Hello World.";
    }

    @GetMapping("/array")
    public List demoList() {
        return Arrays.asList("23","12");
    }
}
