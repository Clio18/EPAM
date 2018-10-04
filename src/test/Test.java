package test;

public class Test {
    public static void main(String[] args) {
        int[][] arraySource = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        String rotateArrayInLine = "";

        int lengthOfIndex = arraySource.length - 1;

        while (lengthOfIndex != -1) {
            for (int i = 0; i < arraySource.length; i++) {
                rotateArrayInLine = rotateArrayInLine + " " + arraySource[i][lengthOfIndex];
            }

            lengthOfIndex--;
        }


        System.out.println(rotateArrayInLine);

    }
}
