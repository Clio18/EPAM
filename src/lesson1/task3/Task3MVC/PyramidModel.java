package lesson1.task3.Task3MVC;

public class PyramidModel {
    private int number;
    private int[][] array;

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setArray(int number) {
        this.array = new int[number][(number - 1) * 2 + 1];
    }

    public int[][] getArray() {
        return array;
    }

    public int[][] getPyramid(int number, int [][]array) {
        int length = (number - 1) * 2 + 1;
        int mid = (length - 1) / 2;
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < length; j++) {
                array[i][mid] = i + 1;
            }
        }

        for (int i = 1; i < number; i++) {
            int k = 1;
            for (int j = mid - 1; j >= 0; j--) {
                if (array[i][mid] - k > 0) {
                    array[i][j] = array[i][mid] - k;
                }
                k++;
            }
        }

        for (int i = 1; i < number; i++) {
            int k = 1;
            for (int j = mid + 1; j < length; j++) {
                if (array[i][mid] - k > 0) {
                    array[i][j] = array[i][mid] - k;
                }
                k++;
            }
        }


        return array;
    }
}