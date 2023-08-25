package com.example.springboothelloworld;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LogController {
    @GetMapping("log")
    public String logTest() {
        log.info("log hello world...");
        return "log test...springboot";
    }
}






