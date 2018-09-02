package cn.demo.controller;

import cn.demo.provide.UserService.IUserService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/consume")
public class ConsumeController {

    //远程引用接口
    @Reference
    private IUserService userService;

    @RequestMapping("/showName")
    @ResponseBody
    public String showName(){
        return userService.getName();
    }
}
