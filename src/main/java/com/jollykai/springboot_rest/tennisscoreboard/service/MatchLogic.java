package com.jollykai.springboot_rest.tennisscoreboard.service;

import com.jollykai.springboot_rest.tennisscoreboard.Match;
import com.jollykai.springboot_rest.tennisscoreboard.Player;
import com.jollykai.springboot_rest.tennisscoreboard.TennisScore;
import org.springframework.stereotype.Service;

@Service
public class MatchLogic{

    private final static int SETS_FOR_WIN = 2;
    private Player player1;
    private Player player2;

    public MatchLogic() {
    }

    public Match matchLogic(String whoGetPoint, Match match) {
        Player player = match.getPlayersList().get(Integer.parseInt(whoGetPoint));
        player.setPointsTaken(player.getPointsTaken() + 1);
        return gameLogic(match);
    }

    public Match gameLogic(Match match) {
        player1 = match.getPlayersList().get(0);
        player2 = match.getPlayersList().get(1);

        if (player1.getPointsTaken() == TennisScore.FORTY.ordinal() &&
                player2.getPointsTaken() < TennisScore.THIRTY.ordinal() ||
                player1.getPointsTaken() == TennisScore.ADVANTAGE.ordinal() &&
                        player2.getPointsTaken() == TennisScore.THIRTY.ordinal()) {
            match.resetPlayerPoints();
            player1.setPlayerSetsScores(match.getCurrentSet());
        } else if (player2.getPointsTaken() == TennisScore.FORTY.ordinal() &&
                player1.getPointsTaken() < TennisScore.THIRTY.ordinal() ||
                player2.getPointsTaken() == TennisScore.ADVANTAGE.ordinal() &&
                        player1.getPointsTaken() == TennisScore.THIRTY.ordinal()) {
            match.resetPlayerPoints();
            player2.setPlayerSetsScores(match.getCurrentSet());
        } else if (player1.getPointsTaken() == TennisScore.FORTY.ordinal() &&
                player2.getPointsTaken() == TennisScore.FORTY.ordinal()) {
            match.resetPlayerAdvantage();
        }
        return setLogic(match);
    }

    public Match setLogic(Match match) {
        int player1Games = player1.getPlayerSetsScores().get(match.getCurrentSet());
        int player2Games = player2.getPlayerSetsScores().get(match.getCurrentSet());
        boolean player1HasAdvantage = player1Games - player2Games >= 2;
        boolean player2HasAdvantage = player2Games - player1Games >= 2;

        if (player1Games >= 6 && player1HasAdvantage) {
            match.setCurrentSet(match.getCurrentSet() + 1);
            player1.setSetsTaken(player1.getSetsTaken() + 1);
        } else if (player2Games >= 6 && player2HasAdvantage) {
            match.setCurrentSet(match.getCurrentSet() + 1);
            player2.setSetsTaken(player2.getSetsTaken() + 1);
        }

        for (Player player : match.getPlayersList()) {
            if (player.getSetsTaken() == SETS_FOR_WIN) {
                match.setWinner(player);
                return match;
            }
        }
        return match;
    }
}
