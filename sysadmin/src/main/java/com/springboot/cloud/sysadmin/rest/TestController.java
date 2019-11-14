package com.springboot.cloud.sysadmin.rest;

import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
@Api("test")
@Slf4j
public class TestController {

    @GetMapping
    public String helloWorld(){
        return "Hello World";
    }
}
