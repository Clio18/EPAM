package lesson5.task3.view;

public interface UserInfo {
    String MAIN_COMMAND = "Enter the command: ";
    String TITLE = "TRANSLATOR" + "\n";
    String INPUT_PAIR = "Enter new pair. " +
            "\n" +
            "First word must be in eng, than blank and the last is ukrainian translation";
    String WELL_DONE = "Next step!";
    String GET_TRANSLATION = "Enter the phrase for translation:  ";
    String NOT_VALID_COMMAND = "Inexistent command!Choose command from the list!";
    String WRONG_INPUT = "Wrong input!The pair is already exist or you made a mistake. Enter new pair";
}
