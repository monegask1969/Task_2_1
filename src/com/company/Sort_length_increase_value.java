package com.company;


/**
 * Created by Max on 08.01.2016.
 */
public class Sort_length_increase_value {
    public static void sort_length_increase_value(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
        System.out.println("Here the sorted array by increasing values ");
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static void sort_length_decrease_value(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
        System.out.println("Here the sorted array by decreasing values: ");
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    }

