package com.company;

import java.util.Scanner;

import static com.company.Shortest_longest_number.longest;
import static com.company.Shortest_longest_number.shortest;
import static com.company.Sort_length_increase_value.sort_length_decrease_value;
import static com.company.Sort_length_increase_value.sort_length_increase_value;

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
       // shortest(arr); //самое короткое число
       // longest(arr); // самое длинное число
       // sort_length_increase_value(arr); //вывод чисел в порядке возрастания
       // sort_length_decrease_value(arr); //вывод чисел в порядке убывания

    }
}
