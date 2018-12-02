package lesson10.main.java.com.epam.task61.exception;

public class UnExistItemMenu extends RuntimeException {
    public UnExistItemMenu(String message) {
        super(message);
    }
}
