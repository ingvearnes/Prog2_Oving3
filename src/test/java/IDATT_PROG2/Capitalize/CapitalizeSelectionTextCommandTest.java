package IDATT_PROG2.Capitalize;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CapitalizeSelectionTextCommandTest {

  private CapitalizeSelectionTextCommand capitalizeSelectionTextCommand;

  @BeforeEach
  public void setUp(){
    capitalizeSelectionTextCommand = new CapitalizeSelectionTextCommand("hei");
  }

  @Test
  void execute() {
    assertEquals("Hei. Hei Hei Hei. brudda Hei!",capitalizeSelectionTextCommand.execute("hei. hei hei hei. brudda hei!"));
  }

  @Test
  void getSelection() {
    assertEquals("hei" , capitalizeSelectionTextCommand.getSelection());
  }
}