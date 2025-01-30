package IDATT_PROG2.ReplaceTests;

import static org.junit.jupiter.api.Assertions.*;

import IDATT_PROG2.Replace.ReplaceTextCommand;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ReplaceTextCommandTest {

  ReplaceTextCommand replaceTextCommand;

  @BeforeEach
  public void setUp(){
    replaceTextCommand = new ReplaceTextCommand("Baba","da");
  }

  @Test
  void execute() {
    assertEquals("Jeg ønsker da å ha det bra",replaceTextCommand.execute("Jeg ønsker Baba å ha det bra"));
  }

  @Test
  void getTarget() {
    assertEquals("Baba",replaceTextCommand.getTarget());
  }

  @Test
  void getReplacement() {
    assertEquals("da",replaceTextCommand.getReplacement());
  }
}