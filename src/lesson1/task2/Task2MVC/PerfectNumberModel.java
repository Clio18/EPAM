package lesson1.task2.Task2MVC;

public class PerfectNumberModel {
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPerfectNumber(int number) {
        String result = "";
        if (number>0) {
            for (int i = 2; i <= number; i++) //исключаем из списка 1
            {
                int counter = 0;
                for (int j = 1; j < i; j++) {
                    if (i % j == 0) {
                        counter = counter + j;
                    }
                }
                if (i == counter) {
                    result = result + i + " ";
                }
            }
        }
                return result;
    }
}
