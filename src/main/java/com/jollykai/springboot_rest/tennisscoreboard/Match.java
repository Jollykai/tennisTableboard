package com.jollykai.springboot_rest.tennisscoreboard;

import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Data
public class Match {

    private int currentSet;
    private final List<String> pointsList = new ArrayList<>(Arrays.asList("00", "15", "30", "40", "40+"));
    private final List<Player> playersList = new ArrayList<>();
    private Player winner;

    public Match() {
        playersList.add(new Player());
        playersList.add(new Player());
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
