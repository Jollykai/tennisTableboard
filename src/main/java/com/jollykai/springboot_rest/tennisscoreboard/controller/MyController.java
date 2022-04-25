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

    @PostMapping("/showScoreboard")
    public String showCurrentMatchStatus(String player1Name, String player2Name, String whoGetPoint, Model model) {
        if (player1Name != null || player2Name != null) {
            match = new Match();
            match.getPlayersList().get(0).setName(player1Name);
            match.getPlayersList().get(1).setName(player2Name);
        } else {
            match = matchLogic.matchLogic(whoGetPoint,match);
        }
        model.addAttribute("match", match);
        if (match.getWinner() == null) {
            return "match-view";
        } else {
            return "game-over-view";
        }
    }
}
