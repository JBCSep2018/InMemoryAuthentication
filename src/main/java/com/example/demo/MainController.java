package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @RequestMapping("/")
    public @ResponseBody String everyone()
    {
        return "Everyone should be able to see this";
    }

    @RequestMapping("/users")
    public @ResponseBody String users()
    {
        return "Users should be able to see this";
    }

    @RequestMapping("/admin")
    public @ResponseBody String admin()
    {
        return "Everyone should be able to see this";
    }

}
