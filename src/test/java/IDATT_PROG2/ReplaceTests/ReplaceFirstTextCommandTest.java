package IDATT_PROG2.ReplaceTests;

import static org.junit.jupiter.api.Assertions.*;

import IDATT_PROG2.Replace.ReplaceFirstTextCommand;
import org.junit.jupiter.api.Test;

class ReplaceFirstTextCommandTest {

  @Test
  void execute() {
    ReplaceFirstTextCommand replaceFirstTextCommand = new ReplaceFirstTextCommand("Jeg","Bro");
    assertEquals("Bro ønsker deg bra.",replaceFirstTextCommand.execute("Jeg ønsker deg bra."));
  }
}