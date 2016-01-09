package com.company;


/**
 * Created by Max on 08.01.2016.
 */
public class Shortest_longest_number {
    public static void shortest(int[] arr){
        String number;
        String shortt = Integer.toString(arr[0]);
        for(Integer numb : arr){
            number = numb.toString();
            for(int i=0; i<arr.length; i++){
                if(number.length() <= shortt.length()){
                    shortt = number;
                }
            }
        }
        System.out.println("Here the shortest number: " + shortt);
    }
    public static void longest(int[] arr){
        String number;
        String longest = Integer.toString(arr[0]);
        for(Integer numb : arr){
            number = numb.toString();
            for(int i=0; i<arr.length; i++){
                if(number.length() >= longest.length()){
                    longest = number;
                }
            }
        }
        System.out.println("Here the longest number: " + longest);
    }
}
