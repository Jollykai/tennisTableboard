package com.jollykai.springboot_rest.tennisscoreboard.controller;

import com.jollykai.springboot_rest.tennisscoreboard.Match;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class MyController {

    Match match;

    @RequestMapping("/")
    public String showFirstView() {
        match = new Match();
        match.getPlayer1().setName("John");
        return "first-view";
    }

    @GetMapping("/match")
    public String startMatch(Model model) {
            model.addAttribute("match", match);
        return "match-view";
    }

    @PostMapping("/match")
    public String playMatch(@RequestBody String point, Model model) {
        model.addAttribute("match", match);
//        match.MatchLogic(point, match);

        if (match.isGameOver()) {
            return "game-over-view";
        } else {
            return "match-view";
        }
    }



}
