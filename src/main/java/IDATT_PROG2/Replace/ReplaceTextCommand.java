package IDATT_PROG2.Replace;

import IDATT_PROG2.TextCommand;

public class ReplaceTextCommand implements TextCommand {

  protected String target;
  protected String replacement;

  /**
   * Constructor.
   * @param target targeted text to replace
   * @param replacement the replacement for the text
   */
  public ReplaceTextCommand(String target, String replacement){
    this.target = target;
    this.replacement = replacement;
  }

  @Override
  public String execute(String text) {
    return text.replace(getTarget(),getReplacement());
  }


  //Accessor-methods
  public String getTarget(){
    return target;
  }
  public String getReplacement(){
    return replacement;
  }
}
