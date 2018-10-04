package task4;

public class Task4 {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();

        rotate(array);

    }

    public static void rotate(int[][] array) {
        int[][] rotateArray = new int[array[0].length][array.length];
        int rotateArrayI = 0;
        int rotateArrayJ = array.length - 1;
        for (int[] srI : array) {
            for (int srJ : srI)
                rotateArray[rotateArrayI++][rotateArrayJ] = srJ;
            rotateArrayI = 0;
            rotateArrayJ--;
        }
        //return retArr;
        for (int i = 0; i < rotateArray.length; i++) {
            for (int j = 0; j < rotateArray[i].length; j++) {
                System.out.print(rotateArray[i][j] + "\t");

            }
            System.out.println();

        }

    }
}
