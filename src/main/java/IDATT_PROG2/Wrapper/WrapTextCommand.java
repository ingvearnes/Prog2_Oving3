package IDATT_PROG2.Wrapper;

import IDATT_PROG2.TextCommand;

public class WrapTextCommand implements TextCommand {

  protected String opening;
  protected String end;

  /**
   * Constructor
   */
  public WrapTextCommand(String opening, String end){
    this.opening = opening;
    this.end = end;
  }

  @Override
  public String execute(String text) {
    return getOpening() + text + getEnd();
  }

  //accessor-methods
  public String getOpening() {
    return opening;
  }

  public String getEnd() {
    return end;
  }
}
