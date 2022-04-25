package com.jollykai.springboot_rest.tennisscoreboard;

import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Data
public class Player {
    private String name;
    private int pointsTaken;
    private final List<Integer> playerSetsScores = new ArrayList<>(Arrays.asList(0,0,0));
    private int setsTaken;

    public Player() {
    }

    public void setPlayerSetsScores(int setPoint)
    {
        playerSetsScores.set(setPoint, playerSetsScores.get(setPoint) + 1);
    }

}
