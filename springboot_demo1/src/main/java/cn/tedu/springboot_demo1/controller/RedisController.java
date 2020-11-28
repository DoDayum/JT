package cn.tedu.springboot_demo1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//@RestController //将返回值转化为JSON
@Controller
public class RedisController {
    private String host = "127.0.0.1";
    private Integer port = 6379;

//    @RequestMapping(value = "/addUser",method = RequestMethod.GET)
    @RequestMapping("/addUser")
    public String getMsg(){
        return "addUser";
    }

}
