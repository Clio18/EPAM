package lesson1.task1;

public class Task1 {
    public static void main(String[] args) {
        int number = 8;
        String numberTo2 = "";
        while (number!=0){
            if (number%2==0){
                numberTo2 = numberTo2 + 0;
            } else numberTo2 = numberTo2 +1;
            number = number/2;
        }
        StringBuilder stringBuilder = new StringBuilder(numberTo2);
        System.out.println(stringBuilder.reverse());
    }


}
