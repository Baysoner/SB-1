package com.example.demo.controller;

import com.example.demo.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PostCreateController {
    @Autowired
    private PostService postsService;

    @GetMapping("/new")
    public String create(){
        return "create";
    }

    @PostMapping("/new")
    public String doCreate(@ModelAttribute("text") String text){
        postsService.create(text);
        return "redirect:/";
    }
}
