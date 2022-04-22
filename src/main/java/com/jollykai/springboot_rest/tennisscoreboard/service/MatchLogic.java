package com.jollykai.springboot_rest.tennisscoreboard.service;

import com.jollykai.springboot_rest.tennisscoreboard.Match;
import com.jollykai.springboot_rest.tennisscoreboard.Player;
import org.springframework.stereotype.Service;

@Service
public class MatchLogic{

    private int SETS_FOR_WIN = 2;

    public MatchLogic() {
    }

    public Match matchLogic(String whoGetPoint, Match match) {
        Player player = match.getPlayersList().get(Integer.parseInt(whoGetPoint));
        player.setPointsTaken(player.getPointsTaken() + 1);

        return gameLogic(match);
    }


//        for (Player player : match.getPlayersList()) {
//            if (player.getSetsTaken() == SETS_FOR_WIN) {
//                match.setWinner(player);
//                return match;
//            }
//        }
//
//
//        return null;
//    }

    public Match gameLogic(Match match) {
        Player player = match.getPlayersList().get(0);
        Player player2 = match.getPlayersList().get(1);

        if (player.getPointsTaken() == 4 && player2.getPointsTaken() < 3 ||
                (player.getPointsTaken() == 5 && player2.getPointsTaken() == 3)) {
            match.resetPlayerPoints();
            player.setPlayerSetsScores(match.getCurrentSet());
        } else if (player2.getPointsTaken() == 4 && player.getPointsTaken() < 3 ||
                player2.getPointsTaken() == 5 && player.getPointsTaken() == 3) {
            match.resetPlayerPoints();
            player2.setPlayerSetsScores(match.getCurrentSet());
        } else if (player.getPointsTaken() == 4 && player2.getPointsTaken() == 4) {
            match.resetPlayerAdvantage();
        }

        return setLogic(match);
    }

    public Match setLogic(Match match) {

        return match;
    }
//    public Match MatchLogic(String point, Match match){
//
//        //Set logic
//        if (match.getPlayer1SetScores(match.getCurrentSet()) >= 6 &&
//                (match.getPlayer1SetScores(match.getCurrentSet())
//                        - match.getPlayer2SetScores(match.getCurrentSet()) >= 2)) {
//            match.setSetsWinsByPlayer1(match.getSetsWinsByPlayer1() + 1);
//            match.setCurrentSet(match.getCurrentSet() + 1);
//        }
//        if (match.getPlayer2SetScores(match.getCurrentSet()) >= 6 &&
//                (match.getPlayer2SetScores(match.getCurrentSet())
//                        - match.getPlayer1SetScores(match.getCurrentSet()) >= 2)) {
//            match.setSetsWinsByPlayer2(match.getSetsWinsByPlayer2() + 1);
//            match.setCurrentSet(match.getCurrentSet() + 1);
//        }
//        //Match logic
//        if (match.getSetsWinsByPlayer1() == 2) {
//            match.setWinner(match.getPlayer1Name());
//            match.setGameOver(true);
//        } else if (match.getSetsWinsByPlayer2() == 2) {
//            match.setWinner(match.getPlayer2Name());
//            match.setGameOver(true);
//        }
//        return match;
//    }
}
