package com.Strategy.ScoreSystem;

public class SquareBalloon extends ScoreAlgorithmBase{
    public int calculateScore(int taps, int multiplier) {
        return (taps * multiplier) + 40;
    }
}
