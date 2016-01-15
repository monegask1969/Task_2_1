package com.company;

/**
 * Created by Max on 15.01.2016.
 */
public class Different_numbers {
    public static void different_numbers(int[] arr){

        char[] ch;
        String tmp;

        for(int i=0; i<arr.length; i++)
        {
            tmp = Integer.toString(arr[i]);
            ch = tmp.toCharArray();
            boolean check = false;
            for (int j=0; j<ch.length-1; j++)                     //проходимся по каждой цифре в числе
            {
                char tmp1 = ch[j];
                    if(tmp1 == ch[j+1]){
                        check = true;
                    }
            }
            if(check == false){
                System.out.println("Here the different number: " + tmp);
            }
        }

    }
}
