package com.company;

import java.util.Scanner;

import static com.company.Shortest_longest_number.shortest;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter quantity of numbers: ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter numbers: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        //shortest(arr);
    }
}
