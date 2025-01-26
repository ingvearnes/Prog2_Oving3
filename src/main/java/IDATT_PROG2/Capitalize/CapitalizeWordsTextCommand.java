package IDATT_PROG2;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CapitalizeWordsTextCommand extends CapitalizeTextCommand{

  @Override
  public String execute(String text) {
    return Arrays.stream(text.split(" "))
        .map(word -> word.substring(0,1).toUpperCase() + word.substring(1))
        .collect(Collectors.joining(" "));
  }
}
