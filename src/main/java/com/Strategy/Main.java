package com.Strategy;

import com.Strategy.ScoreSystem.ScoreBoard;
import com.Strategy.ScoreSystem.SquareBalloon;
import com.Strategy.ScoreSystem.Balloon;
import com.Strategy.ScoreSystem.Clown;

public class Main {
    public static void main(String[] args) {
        ScoreBoard scoreBoard = new ScoreBoard();

        System.out.println("Ballon Tap Score: ");
        scoreBoard.algorithmBase = new Balloon();
        scoreBoard.showScore(10, 5);

        System.out.println("Clown Tap Score: ");
        scoreBoard.algorithmBase = new Clown();
        scoreBoard.showScore(10, 5);

        System.out.println("SquareBalloon Tap Score: ");
        scoreBoard.algorithmBase = new SquareBalloon();
        scoreBoard.showScore(10, 5);
    }
}
