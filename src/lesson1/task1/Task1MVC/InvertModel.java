package lesson1.task1.Task1MVC;

public class InvertModel {
    private int value;
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }

    public String getNumberTo2(int number) {
        String numberTo2 = "";
        while (number != 0) {
            if (number % 2 == 0) {
                numberTo2 = numberTo2 + 0;
            } else numberTo2 = numberTo2 + 1;
            number = number / 2;
        }
        StringBuilder stringBuilder = new StringBuilder(numberTo2);
        String result = String.valueOf(stringBuilder.reverse());
        return result;
    }

    public String getNumberTo8(int number) {
        String numberTo8 = "";
        while (number > 8) {
            int dev = number / 8;
            numberTo8 = numberTo8 + (number - dev * 8);
            number = dev;
            if (dev < 8) {
                numberTo8 = numberTo8 + dev;
            }
        }
        return String.valueOf(new StringBuilder(numberTo8).reverse());
    }

    public String getNumberTo16(int number){
        String s = "0123456789ABCDEF";
        char [] ss = s.toCharArray();
        String numberTo16 = "";
        while (number > 16) {
            int dev = number / 16;
            numberTo16 = numberTo16 + ss[number-dev*16];
            number = dev;
            if (dev < 16) {
                numberTo16 = numberTo16 + ss[dev];
            }
        }
        return String.valueOf(new StringBuilder(numberTo16).reverse());
    }
}
