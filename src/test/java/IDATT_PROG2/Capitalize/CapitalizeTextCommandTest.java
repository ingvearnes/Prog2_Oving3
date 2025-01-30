package IDATT_PROG2.Capitalize;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CapitalizeTextCommandTest {

  @Test
  void execute() {
    CapitalizeTextCommand capitalizeTextCommand = new CapitalizeTextCommand();

    assertEquals("Jeg har en fin dag. Men deg er deg. Kanskje bedre. ",capitalizeTextCommand.execute("jeg har en fin dag. men deg er deg. kanskje bedre."));
  }
}