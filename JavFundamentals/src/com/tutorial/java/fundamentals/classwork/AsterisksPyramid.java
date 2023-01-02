package com.tutorial.java.fundamentals.classwork;

public class AsterisksPyramid {

    public static final String ASTERISKS = "*";
    public static final String SPACE = " ";

    public static void main(String[] args) {
        printAsterisksAsPyramid(10);
//        System.out.println("================");
        printAsterisksAsReversePyramid(10);
    }

    private static void printAsterisksAsPyramid(int n) {
        for (int i = 0; i < n; i++) {
            printAsterisks(n, i);
        }
    }

    private static void printAsterisksAsReversePyramid(int n) {
        for (int i = n - 1; i >= 0; i--) {
            printAsterisks(n, i);
        }
    }

    private static void printAsterisks(int n, int i) {
        int startPoint = 1;
        int temp = n - i;
        if (temp > 1) {
            startPoint = (temp / 2) + 1;
        }
        if (i % 2 == 0) { //want to print line odd to simulate real pyramid
            String output = "";
            for (int j = 0; j < n + 1; j++) {
                int endPoint = startPoint + i ;
                if (j >= startPoint && j <= endPoint) {
                    output = output.concat(ASTERISKS);
                } else {
                    output = output.concat(SPACE);
                }
            }
            System.out.println(output);
        }
    }
}
