package com.example.springboothelloworld;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: Mr.Tong
 */
@RestController
public class ConfigController {

    @NacosValue(value = "${configValue:xiaotong}", autoRefreshed = true)
    private String configValue;

    @GetMapping("config")
    public String configTest() {
        return configValue;
    }
}