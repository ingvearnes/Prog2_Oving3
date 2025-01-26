package IDATT_PROG2;

import java.util.Arrays;

public class WrapSelectionTextCommand extends WrapTextCommand{

  //inherited:
  // opening, end, execute(), getOpening(), getEnd()

  private String selection;

  /**
   * Constructor
   *
   * @param opening
   * @param end
   */
  public WrapSelectionTextCommand(String opening, String end, String selection) {
    super(opening, end);
    this.selection = selection;
  }

  @Override
  public String execute(String text) {
    return text.replaceAll(selection,getOpening()+selection+getEnd());
  }

  //accessor-methods
  public String getSelection(){
    return selection;
  }
}
