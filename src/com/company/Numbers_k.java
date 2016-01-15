package com.company;

import java.util.Scanner;

/**
 * Created by Max on 15.01.2016.
 */
public class Numbers_k {
    public static void numbers_k(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of matrix: ");
        int n = scanner.nextInt();
        int[][] matrix;
        matrix = new int[n][n];
        System.out.println("Enter the limit of numbers: ");
        int k = scanner.nextInt();
        for (int i = 0; i < n; i++) {

            for(int j=0; j < n; j++){
                matrix[i][j] = ((int)(Math.random() * k));
                System.out.print("[" + matrix[i][j] + "]");
            }
            System.out.println();

        }
    }
}
