package com.jollykai.springboot_rest.tennisscoreboard.controller;

import com.jollykai.springboot_rest.tennisscoreboard.Match;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MyController {

    @RequestMapping("/")
    public String showFirstView() {
        return "first-view";
    }

    @RequestMapping("/match")
    public String startMatch(Model model) {
        model.addAttribute("match", new Match());
        return "match-view";
    }

}
