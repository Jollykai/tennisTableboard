package com.jollykai.springboot_rest.tennisscoreboard.controller;

import com.jollykai.springboot_rest.tennisscoreboard.Match;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MyController {

    @RequestMapping("/")
    public String showFirstView(Model model) {
        Match match = new Match();
        model.addAttribute(match);
        return "first-view";
    }

    @PostMapping("/showPlayers")
    public String showTestView(@RequestParam String player1Name, String player2Name,
                               @ModelAttribute Match match, Model model) {
        match.getPlayersList().get(0).setName(player1Name);
        match.getPlayersList().get(1).setName(player2Name);
        model.addAttribute("match", match);
        return "test-view";
    }

    @GetMapping("/showPlayers")
    public String showTestView(@RequestParam String playerWhoGetPoint,
                               @ModelAttribute Match match, Model model) {
        System.out.println(playerWhoGetPoint);


        model.addAttribute("match", match);
        return "test-view";
    }

    @GetMapping("/match")
    public String startMatch(Model model) {
//            model.addAttribute("match", match);
        return "match-view";
    }

    @PostMapping("/match")
    public String playMatch(@RequestBody String point, Model model) {
//        model.addAttribute("match", match);
//        match.MatchLogic(point, match);

//        if (match.isGameOver()) {
//            return "game-over-view";
//        } else {
//            return "match-view";
//        }
          return "match-view";

}



}
