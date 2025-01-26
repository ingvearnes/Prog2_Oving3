package IDATT_PROG2;

public class ReplaceFirstTextCommand extends ReplaceTextCommand{

  //inherited:
  // target, replacement, execute(), getTarget(), getReplacement()

  /**
   * Constructor.
   *
   * @param target      targeted text to replace
   * @param replacement the replacement for the text
   */
  public ReplaceFirstTextCommand(String target, String replacement) {
    super(target, replacement);
  }

  @Override
  public String execute(String text) {
    return text.replaceFirst(target,replacement);
  }
}
