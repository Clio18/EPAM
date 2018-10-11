package lesson1.task4MVC;

public class Model {
    private int [][] array;

    public int[][] getArray() {
        return array = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    }

    //переводит массив в строку (чтение по стобцам начиная с последнего - поворот влево),
    // отделяя пробелами строки. Без пробела в конце строки: "369 258 147"
    public String getArrayInString(int[][]arraySource){
        String rotateArrayToLeft = "";
        int lengthOfIndex = arraySource.length-1;
        while (lengthOfIndex != -1) {
            for (int i = 0; i < arraySource.length; i++) {
                rotateArrayToLeft = rotateArrayToLeft + arraySource[i][lengthOfIndex];
            }
            if (lengthOfIndex!=0) {
                rotateArrayToLeft = rotateArrayToLeft + " ";
            }
            lengthOfIndex--;
        }
        return rotateArrayToLeft;
    }

    //формирует двумерный масив со строки
    public int[][] getArrayFromLine(String rotateArrayToLeft) {
        String[] array = rotateArrayToLeft.split("\\s");
        int[][] copy = new int[array.length][array[1].toCharArray().length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].toCharArray().length; j++) {
                copy[i][j] = Integer.parseInt(String.valueOf(array[i].toCharArray()[j]));
            }
        }
        return copy;
    }

    //для перевода массива вправо необходимо перевернуть строку
    public String rotateArrayToRight(String rotateArrayToLeft){
        return new StringBuilder(rotateArrayToLeft).reverse().toString();
    }


}
