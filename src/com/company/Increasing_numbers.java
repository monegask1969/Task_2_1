package com.company;

/**
 * Created by Max on 15.01.2016.
 */
public class Increasing_numbers {
    public static void increasing_numbers(int[] arr) {

        char[] ch;
        String tmp;


        for(int i=0; i<arr.length; i++)
        {
            tmp = Integer.toString(arr[i]);
            ch = tmp.toCharArray();
            char[] ch2 = ch.clone();

            for (int j = 0; j < ch2.length-1 ; j++)           //проходимся по каждой цифре в числе ch2 и сортируем массив
            {
                if(ch2[j] !=0) {
                    if(ch2[j] > ch2[j+1]) {
                        char tmp2 = ch2[j];
                        ch2[j] = ch2[j + 1];
                        ch2[j + 1] = tmp2;
                    }
                }
            }
            boolean check = false;
            for (int j=0; j<ch.length; j++)                     //проходимся по каждой цифре в числе ch
            {
                if(ch[j] !=0 && ch2[j] != 0) {
                    if (ch[j] == ch2[j]) {
                        check = true;
                    }
                }
            }
            if(check == true)
            {
                System.out.println("Here your number: " + tmp);
            }
        }
    }
}
