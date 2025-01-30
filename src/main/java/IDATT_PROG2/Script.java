package IDATT_PROG2;

import java.util.List;

public class Script implements TextCommand{

  private List<TextCommand> textCommands;

  public Script(List<TextCommand> textCommands){
    this.textCommands = textCommands;
  }

  @Override
  public String execute(String text) {
    for(TextCommand command : textCommands){
      text = command.execute(text);
    }

    return text;
  }
}
