package com.lzb.githubtest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("test")
public class TestController {

    @RequestMapping("name")
    @ResponseBody
    public String name()
    {
        return "hhhh,this is dev,now i had modify in github";
    }
}
