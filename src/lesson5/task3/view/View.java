package lesson5.task3.view;

import java.util.Map;
import java.util.Scanner;

public class View implements UserInfo {
    Scanner scanner = new Scanner(System.in);
    Menu menu = new Menu();


    public void printDictionary(Map map) {
        System.out.println(map);
    }

    public void getListOfCommands() {
        for (String command : menu.getMenu()) {
            System.out.println(command);
        }
    }

    public String generateNewPair() {
        scanner.nextLine();
        String pair = scanner.nextLine();
        String result = "";
        char last = pair.toCharArray()[pair.toCharArray().length - 1];
        String[] arrayOfWord = pair.split("[\\s_0-9]");
        if (arrayOfWord.length == 2 && !Character.isDigit(last)) {
            String[] firstOne = arrayOfWord[0].split("[\\n\\t\\f\\r\\W]");
            if (firstOne.length < 2 && firstOne.length > 0) {
                result = result + firstOne[0] + " ";
            } else result = null + " ";

            String[] secondOne = arrayOfWord[1].split("[\\n\\t\\f\\r\\w\\[a-zA-Z]]");
            if (secondOne.length < 2 && secondOne.length > 0) {
                result = result + secondOne[0];
            } else result = null;

        } else result = null;

        return result;
    }

    public String getPhraseForTranslation() {
        return scanner.nextLine();
    }

    public int inputValue() {
        return scanner.nextInt();
    }

    public void printMessage(String message) {
        System.out.println(message);
    }
}
