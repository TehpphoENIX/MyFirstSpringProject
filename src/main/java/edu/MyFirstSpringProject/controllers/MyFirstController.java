package edu.MyFirstSpringProject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/1")
public class MyFirstController {

    @GetMapping("/hello")
    public String hello(){
        return "1/hello-world";
    }

    @RequestMapping("/{a}+{b}")
    public String sum(@PathVariable Integer a, @PathVariable Integer b, Model model){
        model.addAttribute("a",a);
        model.addAttribute("b",b);
        model.addAttribute("sum", a+b);
        return "1/sum";
    }
}
