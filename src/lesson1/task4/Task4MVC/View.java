package lesson1.task4.Task4MVC;

public class View {
    public void printArray(int[][] array) {
        for (int[]a : array){
            for (int b : a){
                System.out.print(b + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
