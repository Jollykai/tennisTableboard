package com.jollykai.springboot_rest.tennisscoreboard;

public enum TennisScore {

    ZERO (1),
    FIFTEEN (2),
    THIRTY (3),
    FORTY(4),
    ADVANTAGE(5);

    final int index;

    TennisScore(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }
}
