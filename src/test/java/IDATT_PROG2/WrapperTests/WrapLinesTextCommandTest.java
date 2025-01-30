package IDATT_PROG2.WrapperTests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import IDATT_PROG2.Wrapper.WrapLinesTextCommand;
import org.junit.jupiter.api.Test;

class WrapLinesTextCommandTest {

  @Test
  void execute() {
    WrapLinesTextCommand wrapLinesTextCommand = new WrapLinesTextCommand("xX","Xx");

    assertEquals("xXMitt navn er PetroshjaXx\nxXJeg føler meg bra.Xx",wrapLinesTextCommand.execute("Mitt navn er Petroshja\nJeg føler meg bra."));
  }
}