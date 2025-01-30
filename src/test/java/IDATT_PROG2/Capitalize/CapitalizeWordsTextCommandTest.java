package IDATT_PROG2.Capitalize;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CapitalizeWordsTextCommandTest {

  @Test
  void execute() {
    CapitalizeWordsTextCommand capitalizeWordsTextCommand = new CapitalizeWordsTextCommand();

    assertEquals("Cappa. Cappa. Zappa De Cappa",capitalizeWordsTextCommand.execute("cappa. cappa. zappa de cappa"));
  }
}