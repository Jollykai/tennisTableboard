package com.jollykai.springboot_rest.tennisscoreboard;

public class Match {
    private String player1Name = "Jeronimo";
    private String player2Name;
    private String[] points = {"00", "15", "30", "40"};
    private int player1Points;
    private int player2Points;
    private int player1Set1Games;
    private int player2Set1Games;
    private int player1Set2Games;
    private int player2Set2Games;
    private int player1Set3Games;
    private int player2Set3Games;

    private boolean isSetOver;
    private boolean isGameOver;

    public boolean isSetOver() {
        return isSetOver;
    }

    public void setSetOver(boolean setOver) {
        isSetOver = setOver;
    }

    public boolean isGameOver() {
        return isGameOver;
    }

    public void setGameOver(boolean gameOver) {
        isGameOver = gameOver;
    }

    public String getPlayer1Name() {
        return player1Name;
    }

    public void setPlayer1Name(String player1Name) {
        this.player1Name = player1Name;
    }

    public String getPlayer2Name() {
        return player2Name;
    }

    public void setPlayer2Name(String player2Name) {
        this.player2Name = player2Name;
    }

    public int getPlayer1Points() {
        return player1Points;
    }

    public void setPlayer1Points(int player1Points) {
        this.player1Points = player1Points;
    }


    public String[] getPoints() {
        return points;
    }

    public void setPoints(String[] points) {
        this.points = points;
    }

    public int getPlayer2Points() {
        return player2Points;
    }

    public void setPlayer2Points(int player2Points) {
        this.player2Points = player2Points;
    }

    public int getPlayer1Set1Games() {
        return player1Set1Games;
    }

    public void setPlayer1Set1Games(int player1Set1Games) {
        this.player1Set1Games = player1Set1Games;
    }

    public int getPlayer2Set1Games() {
        return player2Set1Games;
    }

    public void setPlayer2Set1Games(int player2Set1Games) {
        this.player2Set1Games = player2Set1Games;
    }

    public int getPlayer1Set2Games() {
        return player1Set2Games;
    }

    public void setPlayer1Set2Games(int player1Set2Games) {
        this.player1Set2Games = player1Set2Games;
    }

    public int getPlayer2Set2Games() {
        return player2Set2Games;
    }

    public void setPlayer2Set2Games(int player2Set2Games) {
        this.player2Set2Games = player2Set2Games;
    }

    public int getPlayer1Set3Games() {
        return player1Set3Games;
    }

    public void setPlayer1Set3Games(int player1Set3Games) {
        this.player1Set3Games = player1Set3Games;
    }

    public int getPlayer2Set3Games() {
        return player2Set3Games;
    }

    public void setPlayer2Set3Games(int player2Set3Games) {
        this.player2Set3Games = player2Set3Games;
    }

    public Match() {
    }
}
