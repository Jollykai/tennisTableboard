package com.jollykai.springboot_rest.tennisscoreboard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Player {
    private String name;
    private int pointsTaken;
    private List<Integer> playerSetsScores = new ArrayList<>(Arrays.asList(0,0,0));
    private int setsTaken;

    public Player() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPointsTaken() {
        return pointsTaken;
    }

    public void setPointsTaken(int pointsTaken) {
        this.pointsTaken = pointsTaken;
    }

    public List<Integer> getPlayerSetsScores() {
        return playerSetsScores;
    }

    public void setPlayerSetsScores(List<Integer> playerSetsScores) {
        this.playerSetsScores = playerSetsScores;
    }

    public int getSetsTaken() {
        return setsTaken;
    }

    public void setSetsTaken(int setsTaken) {
        this.setsTaken = setsTaken;
    }
}
