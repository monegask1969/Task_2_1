package com.company;


/**
 * Created by Max on 08.01.2016.
 */
public class More_less_medium_length {
    public static void less_medium_length(int[] arr){
        int average = 0;
        String number;
        String tmp;
        for(Integer numb : arr){
            number = numb.toString();
            average = number.length() + average;
        }
        System.out.println("Average length = " + average/arr.length);
        System.out.println("Elements which length more than average length: ");
        for(Integer numb : arr){
            number = numb.toString();
            if(number.length() > average/arr.length){
                System.out.println(number);
            }
        }
        System.out.println("Elements which length less than average length: ");
        for(Integer numb : arr){
            number = numb.toString();
            if(number.length() < average/arr.length){
                System.out.println(number);
            }
        }
    }
}
