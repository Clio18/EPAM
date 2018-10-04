package lesson1.task3;

public class Task3 {
    public static void main(String[] args) {
        int height = 4;
        int length = (height - 1) * 2 + 1; //5
        int mid = (length - 1) / 2; //2
        int[][] array = new int[height][length];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < length; j++) {
                //array[i][j] = 0;
                array[i][mid] = i + 1;
            }
        }

        for (int i = 1; i < height; i++) {
            int k = 1;
            for (int j = mid - 1; j >= 0; j--) {
                if (array[i][mid] - k > 0) {
                    array[i][j] = array[i][mid] - k;

                }
                k++;
            }
        }

        for (int i = 1; i < height; i++) {
            int k = 1;
            for (int j = mid + 1; j < length; j++) {
                if (array[i][mid] - k > 0) {
                    array[i][j] = array[i][mid] - k;
                }
                k++;
            }
        }


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");

            }
            System.out.println();

        }


    }

}
