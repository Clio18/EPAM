package lesson1.task2;

public class Task2 {
    public static void main(String[] args) {
        int last = 1000000;

        for (int i = 2; i <= last; i++) {
            int counter = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    counter = counter + j;
                }
            }
            if (i == counter){
                System.out.println(i);
            }

        }
    }

}
