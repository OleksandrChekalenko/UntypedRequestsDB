package com.test.bu.controller;

import com.test.bu.service.interfaces.RequestsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

    @Autowired
    private RequestsService requestsService;

    @GetMapping("/")
    public String index() {
        return "index";
    }


    @GetMapping("/firstQuery")
    public String firstQuery(Model model) {
        model.addAttribute("firstQuery", requestsService.getFirstQuery());
        return "firstQuery";
    }

    @GetMapping("/secondQuery")
    public String secondQuery(Model model) {
        model.addAttribute("secondQuery", requestsService.getSecondQuery());
        return "secondQuery";
    }
}
