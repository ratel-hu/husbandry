package com.husbandry.struggle.controller.husbandry;

import com.husbandry.struggle.controller.husbandry.dao.TestDao;
import com.husbandry.struggle.controller.husbandry.model.dto.ReturnDto;
import com.husbandry.struggle.controller.husbandry.model.dto.ReturnUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author ratelhu
 * @Date 2020/12/22 20:45
 * @Version 1.0
 */
@RestController
@RequestMapping("/api/v1")
public class TestController {

    @Autowired
    private TestDao dao;
    @RequestMapping("/test")
    public ReturnDto test(){

        return ReturnUtil.success(dao.getData());
    }




}
