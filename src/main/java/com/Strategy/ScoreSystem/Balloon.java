package com.Strategy.ScoreSystem;

public class Balloon extends ScoreAlgorithmBase {
    public int calculateScore(int taps, int multiplier) {
        return (taps * multiplier) - 20;
    }
}
