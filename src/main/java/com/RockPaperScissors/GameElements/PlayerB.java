package com.RockPaperScissors.GameElements;

import java.util.Random;

public class PlayerB extends Player{
  Random random;

  public PlayerB(String name) {
    super(name);
    random = new Random();
  }

  @Override
  public String getChoice() {
    String[] options = {"rock", "paper", "scissors"};
    int randomIndex = random.nextInt(3);
    return options[randomIndex];
  }
}
