package com.jollykai.springboot_rest.tennisscoreboard.controller;

import com.jollykai.springboot_rest.tennisscoreboard.Match;
import com.jollykai.springboot_rest.tennisscoreboard.service.MatchLogic;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MyController {

    Match match;
    MatchLogic matchLogic = new MatchLogic();

    @RequestMapping("/")
    public String showFirstView(Model model) {
        match = new Match();
        model.addAttribute(match);
        return "first-view";
    }

    @PostMapping("/showPlayers")
    public String showTestView(@RequestParam String player1Name, String player2Name, Model model) {
        match.getPlayersList().get(0).setName(player1Name);
        match.getPlayersList().get(1).setName(player2Name);
        model.addAttribute("match", match);
        return "match-view";
    }

    @GetMapping("/showPlayers")
    public String showTestView2(@RequestParam String whoGetPoint, Model model) {
        match = matchLogic.matchLogic(whoGetPoint,match);
        model.addAttribute("match", match);
        if (match.getWinner() == null) {
            return "match-view";
        } else {
            return "game-over-view";
        }
    }
}
