package com.RockPaperScissors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.RockPaperScissors.GameElements.Counter;
import com.RockPaperScissors.GameElements.Game;
import com.RockPaperScissors.GameElements.PlayerA;
import com.RockPaperScissors.GameElements.PlayerB;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

public class RockPaperScissorsTests {
  @Test
  void testPlayerAAllwaysPicksPaper() {
    PlayerA playerA = new PlayerA("A");
    assertEquals("paper", playerA.getChoice());
  }

  @Test
  void testPlayerBChoice() {
    PlayerB playerB = new PlayerB("B");
    List<String> options = new ArrayList<String>();
    options.add("rock");
    options.add("paper");
    options.add("scissors");
    assertTrue(options.contains(playerB.getChoice()));
  }

  @Test
  void testCounter() {
    Counter counter = new Counter();
    counter.updateCounter("A");
    assertEquals(1, counter.playerAWins);
    counter.updateCounter("B");
    assertEquals(1, counter.playerBWins);
    counter.updateCounter("draw");
    assertEquals(1, counter.draw);
  }
  @Test
  public void testStart_PlayerAWins() {
    Game game = new Game();
    game.start();

    Counter counter = game.counter;
    int playerAWins = counter.playerAWins;
    int playerBWins = counter.playerBWins;
    int draw = counter.draw;

    assertTrue(playerAWins > 0);
    assertTrue(playerBWins > 0);
    assertTrue(draw > 0);
  }

  @Test
  public void testStart_Played100Games() {
    Game game = new Game();
    game.start();

    Counter counter = game.counter;
    int playerAWins = counter.playerAWins;
    int playerBWins = counter.playerBWins;
    int draw = counter.draw;

    assertEquals(100, playerAWins + playerBWins + draw);
  }
}
