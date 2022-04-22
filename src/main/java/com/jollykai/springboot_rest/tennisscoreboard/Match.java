package com.jollykai.springboot_rest.tennisscoreboard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Match {

    private int currentSet;
    private final List<String> pointsList = new ArrayList<>(Arrays.asList("00", "15", "30", "40", "40+"));
    private final List<Player> playersList = new ArrayList<>();
    private Player winner;

    public Match() {
        playersList.add(new Player());
        playersList.add(new Player());
    }

    public int getCurrentSet() {
        return currentSet;
    }

    public void setCurrentSet(int currentSet) {
        this.currentSet = currentSet;
    }

    public List<Player> getPlayersList() {
        return playersList;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public List<String> getPointsList() {
        return pointsList;
    }

    public void resetPlayerPoints() {
        for (Player player : playersList) {
            player.setPointsTaken(0);
        }
    }

    public void resetPlayerAdvantage() {
        for (Player player : playersList) {
            player.setPointsTaken(3);
        }
    }
}
