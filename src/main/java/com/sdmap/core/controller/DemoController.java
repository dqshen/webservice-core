package com.sdmap.core.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    
    //基本服务示例，在命令行执行下面的curl看效果，或者直接在浏览器地址栏查看
    //curl "http://192.168.200.137:8080/hello?who=GIS"
    @GetMapping("/hello")
    public String hello(@RequestParam(value="who",defaultValue = "world")String who){
        return "Hello" + who;
    }
}
