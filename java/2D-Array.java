package com.company;

public class Main {

    public static void main(String[] args) {
        //2R 3C:
        //123
        //456
        int[][] arr = new int[2][3];
        //Entering data
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 0) {
                    arr[i][j] = j + 1;
                } else {
                    arr[i][j] = j + 4;
                }
            }
        }
        //Printing
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + arr[i][j]);
            }
            System.out.println("");
        }

        System.out.println("\n\n");

        //3R 2C:
        //2 4
        //6 8
        //10 12
        int[][] arr1 = new int[3][2];

        //Entering -
        int k = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                arr1[i][j] = k*2;
                k++;
            }
        }
        //Printing-
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(" " + arr1[i][j]);
            }
            System.out.println("");
        }


    }
}
