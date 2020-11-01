package com.wp.platform;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author wp
 * @Description
 * @Date 2020/11/1 11:20
 */
@RestController
@RequestMapping("/jenkins")
public class TestController {
    @GetMapping("/test")
    public Object test() {
        return "hello world man test!";
    }
}
