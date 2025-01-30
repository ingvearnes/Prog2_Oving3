package IDATT_PROG2.WrapperTests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import IDATT_PROG2.Wrapper.WrapTextCommand;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WrapTextCommandTest {

  private WrapTextCommand wrapTextCommand;

  @BeforeEach
  public void setUp(){
    wrapTextCommand = new WrapTextCommand("xX","Xx");
  }

  @Test
  void execute() {
    assertEquals("xXTheIngveGamerProLolMLGXx",wrapTextCommand.execute("TheIngveGamerProLolMLG"));
  }

  @Test
  void getOpening() {
    assertEquals("xX",wrapTextCommand.getOpening());
  }

  @Test
  void getEnd() {
    assertEquals("Xx",wrapTextCommand.getEnd());
  }
}