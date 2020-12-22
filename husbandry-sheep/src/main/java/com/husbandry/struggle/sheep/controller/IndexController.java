package com.husbandry.struggle.sheep.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author ratelhu
 * @Date 2020/12/22 17:04
 * @Version 1.0
 */
@Controller
@RequestMapping("/test")
public class IndexController {
    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        return "hello world!";
    }
}
