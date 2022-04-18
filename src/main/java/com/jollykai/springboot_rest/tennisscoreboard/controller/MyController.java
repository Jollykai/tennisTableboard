package com.jollykai.springboot_rest.tennisscoreboard.controller;

import com.jollykai.springboot_rest.tennisscoreboard.Match;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class MyController {

    @RequestMapping("/")
    public String showFirstView() {
        return "first-view";
    }

    @GetMapping("/match")
    public String startMatch(Model model) {
        model.addAttribute("match", new Match());
        return "match-view";
    }

    @PostMapping("/match")
    public String playMatch(@RequestBody String point, @ModelAttribute("match") Match match) {
        System.out.println(point.charAt(0));
        if (point.charAt(0) == '1') {
            int matchpoint = match.getPlayer1Points();
            System.out.println(matchpoint);
            matchpoint++;
            System.out.println(matchpoint);
            match.setPlayer1Points(matchpoint);
            System.out.println(match.getPlayer1Points());
        }
        System.out.println(point);

        return "match-view";
    }



}
