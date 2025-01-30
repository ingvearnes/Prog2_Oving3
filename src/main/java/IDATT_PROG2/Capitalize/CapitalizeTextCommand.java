package IDATT_PROG2.Capitalize;

import IDATT_PROG2.TextCommand;

public class CapitalizeTextCommand implements TextCommand {


  @Override
  public String execute(String text) {
    String[] sentences = text.split("(?<=\\.)");
    StringBuilder result = new StringBuilder();

    for(String sentence : sentences){
      sentence = sentence.trim();
      String capitalizedSentence = sentence.substring(0,1).toUpperCase() + sentence.substring(1);
      result.append(capitalizedSentence).append(" ");
    }
    return result.toString();
  }
}
