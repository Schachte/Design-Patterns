package com.Strategy.ScoreSystem;

public class Clown extends ScoreAlgorithmBase{
    public int calculateScore(int taps, int multiplier) {
        return (taps * multiplier) - 10;
    }
}
