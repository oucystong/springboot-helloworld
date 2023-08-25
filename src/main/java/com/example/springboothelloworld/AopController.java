package com.example.springboothelloworld;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: Mr.Tong
 */
@Slf4j
@RestController
public class AopController {
    @GetMapping("aop")
    public String aopTest() {
        log.info("aop hello world...");
        return "aop test...springboot";
    }
}
