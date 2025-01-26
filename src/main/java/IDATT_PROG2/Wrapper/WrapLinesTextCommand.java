package IDATT_PROG2.Wrapper;

import java.util.Arrays;
import java.util.stream.Collectors;

public class WrapLinesTextCommand extends WrapTextCommand{

  //inherited:
  // opening, end, execute(), getOpening(), getEnd()

  /**
   * Constructor
   *
   * @param opening
   * @param end
   */
  public WrapLinesTextCommand(String opening, String end) {
    super(opening, end);
  }

  @Override
  public String execute(String text) {
    return Arrays.stream(text.split("\n"))
        .map(line -> getOpening()+line+getEnd())
        .collect(Collectors.joining("\n"));
  }
}
