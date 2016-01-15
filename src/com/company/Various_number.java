package com.company;

/**
 * Created by Max on 14.01.2016.
 */
public class Various_number {
    public static void various_number(int[] arr){
        char[] ch;
        int min_povtor = 0;
        int index_povtor = 0;
        int povtor = 0;
        String tmp;
        for(int i=0; i<arr.length; i++){
            tmp = Integer.toString(arr[i]);
            ch = tmp.toCharArray();
            for (int j=0; j<ch.length-1; j++) {
                if (ch[j] == ch[j + 1]) {
                    povtor +=1;
                }
                if(povtor < min_povtor){
                    min_povtor = povtor;
                    index_povtor = i;
                }
            }
        }
        System.out.println("The smallest number of repetitions in " + arr[index_povtor]);
    }
}
