package com.jollykai.springboot_rest.tennisscoreboard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Match {

    private int currentSet;
    private final List<String> pointsList = new ArrayList<>(Arrays.asList("00", "15", "30", "40", "40+"));
    private List<Player> playersList = new ArrayList<>();
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

    public void setPlayersList(List<Player> playersList) {
        this.playersList = playersList;
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

    //    Names
    //Players
//    Player player1 = new Player();
//    Player player2 = new Player();
    //    private String player1Name = "Player1"; //in Player
    //    private String player2Name = "Player2"; //in Player
    //Points
    //    private int player1Points; //in Player
    //    private int player2Points; //in Player
    //Sets
    //    private List<Integer> player1SetScores = new ArrayList<>(Arrays.asList(0,0,0)); //in Player
    //    private List<Integer> player2SetScores = new ArrayList<>(Arrays.asList(0,0,0)); //in Player
    //    private int setsWinsByPlayer1; //in Player
    //    private int setsWinsByPlayer2; //in Player
    //Booleans
//    private boolean isGameOver;

    //Names
//    public String getPlayer1Name() {
//        return player1Name;
//    }

//    public void setPlayer1Name(String player1Name) {
//        this.player1Name = player1Name;
//    }
//---------------------------------------
//    public String getPlayer2Name() {
//        return player2Name;
//    }

//    public void setPlayer2Name(String player2Name) {
//        this.player2Name = player2Name;
//    }

    //Points
//    public List<String> getPoints() {
//        return pointsList;
//    }

//    public void setPoints(List<String>) {
//        this.pointsList = pointsList;
//    }
//---------------------------------------
//    public int getPlayer1Points() {
//        return player1Points;
//    }

//    public void setPlayer1Points(int player1Points) {
//        this.player1Points = player1Points;
//    }
//---------------------------------------
//    public int getPlayer2Points() {
//        return player2Points;
//    }

//    public void setPlayer2Points(int player2Points) {
//        this.player2Points = player2Points;
//    }
    //Sets
//    public List<Integer> getPlayer1SetScores() {
//        return player1SetScores;
//    }

//    public void setPlayer1SetScores(List<Integer> player1SetScores) {
//        this.player1SetScores = player1SetScores;
//    }
//---------------------------------------
//    public List<Integer> getPlayer2SetScores() {
//        return player2SetScores;
//    }

//    public void setPlayer2SetScores(List<Integer> player2SetScores) {
//        this.player2SetScores = player2SetScores;
//    }
//---------------------------------------
//    public Integer getPlayer1SetScores(int x) {
//        return player1SetScores.get(x);
//    }

//    public void setPlayer1SetScores(int x) {
//        this.player1SetScores.set(x, getPlayer1SetScores(x) + 1);
//    }
//---------------------------------------
//    public Integer getPlayer2SetScores(int x) {
//        return player2SetScores.get(x);
//    }

//    public void setPlayer2SetScores(int x) {
//        this.player2SetScores.set(x, getPlayer2SetScores(x) + 1);
//    }
//---------------------------------------
//    public int getSetsWinsByPlayer1() {
//        return setsWinsByPlayer1;
//    }

//    public void setSetsWinsByPlayer1(int setsWinsByPlayer1) {
//        this.setsWinsByPlayer1 = setsWinsByPlayer1;
//    }
//---------------------------------------
//    public int getSetsWinsByPlayer2() {
//        return setsWinsByPlayer2;
//    }

//    public void setSetsWinsByPlayer2(int setsWinsByPlayer2) {
//        this.setsWinsByPlayer2 = setsWinsByPlayer2;
//    }
//---------------------------------------
//    public int getCurrentSet() {
//        return currentSet;
//    }
//
//    public void setCurrentSet(int currentSet) {
//        this.currentSet = currentSet;
//    }
//    //Booleans
//    public boolean isGameOver() {
//        return isGameOver;
//    }
//
//    public void setGameOver(boolean gameOver) {
//        isGameOver = gameOver;
//    }
//
//    public String getWinner() {
//        return winner;
//    }
//
//    public void setWinner(String winner) {
//        this.winner = winner;
//    }
//
//    public Match() {
//    }
//
//    public Player getPlayer1() {
//        return player1;
//    }
//
//    public void setPlayer1(Player player1) {
//        this.player1 = player1;
//    }
//
//    public Player getPlayer2() {
//        return player2;
//    }
//
//    public void setPlayer2(Player player2) {
//        this.player2 = player2;
//    }

//    public Match MatchLogic(String point, Match match){
//        //Game logic
//        if (point.charAt(0) == '1') {
//            match.setPlayer1Points(match.getPlayer1Points()+1);
//            if (match.getPlayer1Points() == 4 && match.getPlayer2Points() < 3) {
//                match.setPlayer1Points(0);
//                match.setPlayer2Points(0);
//                match.setPlayer1SetScores(match.getCurrentSet());
//            } else if (match.getPlayer1Points() == 5 && match.getPlayer2Points() == 3) {
//                match.setPlayer1Points(0);
//                match.setPlayer2Points(0);
//                match.setPlayer1SetScores(match.getCurrentSet());
//            } else if (match.getPlayer1Points() == 4 && match.getPlayer2Points() == 4){
//                match.setPlayer1Points(3);
//                match.setPlayer2Points(3);
//            }
//        }
//        if (point.charAt(0) == '2') {
//            match.setPlayer2Points(match.getPlayer2Points()+1);
//            if (match.getPlayer2Points() == 4 && match.getPlayer1Points() < 3) {
//                match.setPlayer1Points(0);
//                match.setPlayer2Points(0);
//                match.setPlayer2SetScores(match.getCurrentSet());
//            } else if (match.getPlayer2Points() == 5 && match.getPlayer1Points() == 3) {
//                match.setPlayer1Points(0);
//                match.setPlayer2Points(0);
//                match.setPlayer2SetScores(match.getCurrentSet());
//            } else if (match.getPlayer2Points() == 4 && match.getPlayer1Points() == 4){
//                match.setPlayer1Points(3);
//                match.setPlayer2Points(3);
//            }
//        }
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
