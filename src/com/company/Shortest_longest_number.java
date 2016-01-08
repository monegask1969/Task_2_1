package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Max on 08.01.2016.
 */
public class Shortest_longest_number {
    public static void shortest(int[] arr){
        String number;
        String shortt = Integer.toString(arr[1]);
        List<Integer> shortest = new ArrayList<Integer>();
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
}
