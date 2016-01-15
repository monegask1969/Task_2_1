package com.company;

import java.util.Scanner;

import static com.company.Different_elements.different_elements;
import static com.company.Different_numbers.different_numbers;
import static com.company.Even_numb_with_equal_oddeven.even_numb_equal;
import static com.company.Increasing_numbers.increasing_numbers;
import static com.company.More_less_medium_length.less_medium_length;
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
       // less_medium_length(arr); // числа, длина которых меньше (больше) средней, а также длинa
       // different_elements(arr); //число, в котором число различных цифр минимально
      // even_numb_equal(arr);   //количество чисел, содержащих только четные цифры
      //  increasing_numbers(arr); //число, цифры в котором идут в строгом порядке возрастания
        different_numbers(arr);  //число, состоящее только из различных цифр
    }
}
