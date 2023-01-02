package com.tutorial.java.fundamentals.arrays;

public class MultiDimensionalArray {

    public static void main(String[] args) {
        //Two dimensional Array

//        data_type[][] array_name = new data_type[x][y];
//        For example: int[][] arr = new int[10][20];

//For example         [3, 4]
//                    [2, 1]


        int [][] twoDimensionArray = new int[2][2]; //size of this array is 2 * 2 = 4
        twoDimensionArray[0][0] = 3;
        twoDimensionArray[0][1] = 4;
        twoDimensionArray[1][0] = 2;
        twoDimensionArray[1][1] = 1;
        print2DArray(twoDimensionArray,2,2);

//        System.out.println(twoDimensionArray[0][0]);
//        System.out.println(twoDimensionArray[0][1]);
//        System.out.println(twoDimensionArray[1][0]);
//        System.out.println(twoDimensionArray[1][1]);

        int [][] twoDArray = new int[][] {{3,4},{2, 1}};
        print2DArray(twoDArray, 2, 2);

        int [][] anotherTwoDimensionArray = new int[5][4]; //size of this array is 2 * 2 = 4
        anotherTwoDimensionArray[0][0] = 3;
        anotherTwoDimensionArray[0][1] = 4;
        anotherTwoDimensionArray[0][2] = 5;
        anotherTwoDimensionArray[0][3] = 9;
        anotherTwoDimensionArray[1][0] = 2;
        anotherTwoDimensionArray[1][1] = 1;
        anotherTwoDimensionArray[1][2] = 7;
        anotherTwoDimensionArray[1][3] = 8;
        anotherTwoDimensionArray[2][0] = 1;
        anotherTwoDimensionArray[2][1] = 9;
        anotherTwoDimensionArray[2][2] = 8;
        anotherTwoDimensionArray[2][3] = 3;
        anotherTwoDimensionArray[3][0] = 2;
        anotherTwoDimensionArray[3][1] = 8;
        anotherTwoDimensionArray[3][2] = 2;
        anotherTwoDimensionArray[3][3] = 6;
        anotherTwoDimensionArray[4][0] = 5;

        print2DArray(anotherTwoDimensionArray, 5, 4);


//Three dimensional Array
//        data_type[][][] array_name = new data_type[x][y][z];
//        For example: int[][][] arr = new int[10][20][30];
        int [][][] threeDimensionArray = new int[3][3][3];
        threeDimensionArray[0][0][0] = 3;
        threeDimensionArray[0][0][1] = 5;
        threeDimensionArray[0][1][0] = 2;
        threeDimensionArray[0][1][1] = 9;
        threeDimensionArray[1][0][0] = 2;
        threeDimensionArray[1][0][1] = 0;
        threeDimensionArray[1][1][0] = 8;
        threeDimensionArray[1][1][1] = 4;

        print3DArray(threeDimensionArray, 3, 3, 3);

        int another3DArray [][][] = new int[][][] {{{1,2,3}, {4,5,6}}, {{7,8,9}, {0,9,8}}};
        print3DArray(another3DArray, 2, 2, 3);
    }

    private static void print3DArray(int[][][] threeDimensionArray, int xIndex, int yIndex, int zIndex) {
        System.out.println("======================");
        for (int i = 0; i < xIndex; i++) {
            for (int j = 0; j < yIndex; j++) {
                for (int k = 0; k < zIndex; k++) {
                    System.out.print(threeDimensionArray[i][j][k] + " ");
                }
                System.out.println();
            }
        }
    }

    private static void print2DArray(int[][] twoDimensionArray, int row, int column) {
        System.out.println("======================");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(twoDimensionArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
