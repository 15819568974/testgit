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
        return "hhhh,now i had modify in idea,committing!!!!!!!";
    }
}
