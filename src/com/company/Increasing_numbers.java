package com.company;

/**
 * Created by Max on 15.01.2016.
 */
public class Increasing_numbers {
    public static void increasing_numbers(int[] arr) {
        char[] ch;
        String tmp;
        char[] ch2;

        for(int i=0; i<arr.length; i++)
        {
            tmp = Integer.toString(arr[i]);
            ch = tmp.toCharArray();
            sortion_check(ch);
        }
    }

    public static void sortion_check(char[] ch){
        char[] ch2;
        ch2 = ch;
        for (int barrier = ch2.length - 1; barrier >= 0; barrier--) {
            for (int index = 0; index < barrier; index++) {
                if (ch2[index] > ch2[index + 1]) {
                    char tmp = ch2[index];
                    ch2[index] = ch2[index + 1];
                    ch2[index + 1] = tmp;
                }
            }
        }
        for (int i = 0; i < ch.length ; i++) {
            if(ch[i] == ch2[i]){

            }
        }
        System.out.println("This amount of numbers is good: " + ch);
    }
}
