package IDATT_PROG2.WrapperTests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import IDATT_PROG2.Wrapper.WrapSelectionTextCommand;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WrapSelectionTextCommandTest {

  private WrapSelectionTextCommand wrapSelectionTextCommand;

  @BeforeEach
  public void setUp(){
    wrapSelectionTextCommand = new WrapSelectionTextCommand("Xx","xX","Ingve");

  }

  @Test
  void execute() {

    assertEquals("Jeg heter XxIngvexX brudda",wrapSelectionTextCommand.execute("Jeg heter Ingve brudda"));
  }

  @Test
  void getSelection() {
    assertEquals("Ingve",wrapSelectionTextCommand.getSelection());
  }
}