package com.RockPaperScissors.GameElements;

public class PlayerA extends Player{
  public PlayerA(String name) {
    super(name);
  }

  @Override
  public String getChoice() {
    return "paper";
  }
}
