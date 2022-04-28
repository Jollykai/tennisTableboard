package com.jollykai.springboot_rest.tennisscoreboard.controller;

import com.jollykai.springboot_rest.tennisscoreboard.Match;
import com.jollykai.springboot_rest.tennisscoreboard.service.MatchLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class MyController {
    Match match = new Match();
    @Autowired
    MatchLogic matchLogic;

    @PostMapping("/startMatch")
    public String startMatch(String player1Name, String player2Name, Model model) {
        //Check - match already finished
        if (match.getWinner() != null) {
            model.addAttribute("match", match);
            return "game-over-view";
        }
        //Check - match already started
        if (match.getPlayersList().get(0).getName() != null || match.getPlayersList().get(1).getName() != null) {
            model.addAttribute("match", match);
            return "match-view";
        }
        match.getPlayersList().get(0).setName(player1Name);
        match.getPlayersList().get(1).setName(player2Name);
        model.addAttribute("match", match);
        return "match-view";
    }

    @PostMapping("/showMatch")
    public String showMatchStatus(String whoGetPoint, Model model) {
        if (match.getWinner() != null) {
            model.addAttribute("match", match);
            return "game-over-view";
        }
        match = matchLogic.matchLogic(whoGetPoint,match);
        model.addAttribute("match", match);
        return "match-view";
    }

    @RequestMapping("/startNewMatch")
    public RedirectView clearOldMatchData(Model model) {
        match = new Match();
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl("http://localhost:8080");
        return redirectView;
    }
}
