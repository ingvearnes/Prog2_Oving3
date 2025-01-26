package IDATT_PROG2.Capitalize;

public class CapitalizeSelectionTextCommand extends CapitalizeTextCommand{

  private String selection;

  public CapitalizeSelectionTextCommand(String selection){
    this.selection = selection;
  }

  @Override
  public String execute(String text) {
    return text.replaceAll(selection,selection.substring(0,1).toUpperCase() + selection.substring(1));
  }

  //Accessor-methods
  public String getSelection() {
    return selection;
  }
}
