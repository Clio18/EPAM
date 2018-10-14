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
            for (int i = 2; i <= number/2; i++) //исключаем из списка 1
            {
                if (i == getSumOfDiv(i)){
                    result = result + i + " ";
                }
            }
        }
                return result;
    }

    public int getSumOfDiv(int num){
        int counter = 0;
        for (int i = 1; i < num; i++) {
            if(num%i==0){
                counter = counter + i;
            }
        }
        return counter;
    }
}
