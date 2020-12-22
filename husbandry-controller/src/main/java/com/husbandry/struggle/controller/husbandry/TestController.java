package com.husbandry.struggle.controller.husbandry;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author ratelhu
 * @Date 2020/12/22 20:45
 * @Version 1.0
 */
@Controller
@RequestMapping("api/v1/test")
public class TestController {

    @ResponseBody
    @RequestMapping("/")
    public String test(){
        return "hello world!";
    }




}
