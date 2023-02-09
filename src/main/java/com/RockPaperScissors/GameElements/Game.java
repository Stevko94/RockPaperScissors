package com.RockPaperScissors.GameElements;

public class Game {
  private final int NUM_GAMES = 100;
  Player playerA;
  Player playerB;
  public Counter counter;

  public Game() {
    playerA = new PlayerA("A");
    playerB = new PlayerB("B");
    counter = new Counter();
  }

  public void start() {
    for (int i = 0; i < NUM_GAMES; i++) {
      String choiceA = playerA.getChoice();
      String choiceB = playerB.getChoice();
      String winner = determineWinner(choiceA, choiceB);
      counter.updateCounter(winner);

    }
    System.out.println(playerA.name+" wins: "+counter.playerAWins);
    System.out.println(playerB.name+" wins: "+counter.playerBWins);
    System.out.println(" draw: "+counter.draw);
  }

  private String determineWinner(String choiceA, String choiceB) {
    if (choiceA.equals(choiceB)) {
      return "draw";
    } else if (choiceA.equals("rock") && choiceB.equals("scissors")) {
      return "A";
    } else if (choiceA.equals("paper") && choiceB.equals("rock")) {
      return "A";
    } else if (choiceA.equals("scissors") && choiceB.equals("paper")) {
      return "A";
    } else {
      return "B";
    }
  }
}
