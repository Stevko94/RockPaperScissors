package com.RockPaperScissors.GameElements;

public class Counter {
  public int playerAWins;
  public int playerBWins;
  public int draw;

  public Counter() {
    playerAWins = 0;
    playerBWins = 0;
    draw = 0;
  }

  public void updateCounter(String winner) {
    if (winner.equals("A")) {
      playerAWins++;
    } else if (winner.equals("B")) {
      playerBWins++;
    } else {
      draw++;
    }
  }
}
