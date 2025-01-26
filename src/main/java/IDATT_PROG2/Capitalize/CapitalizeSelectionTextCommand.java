package IDATT_PROG2;

public class CapitalizeSelectionTextCommand extends CapitalizeTextCommand{

  private String selection;

  public CapitalizeSelectionTextCommand(String selection){
    this.selection = selection;
  }

  @Override
  public String execute(String text) {
    
  }

  //Accessor-methods
  public String getSelection() {
    return selection;
  }
}
