package com.company;

/**
 * Created by Max on 14.01.2016.
 */
public class Even_numb_with_equal_oddeven
{
    public static void even_numb_equal(int[] arr)
    {
        int kolvo = 0;
        char[] ch;
        String tmp;

        for(int i=0; i<arr.length; i++)
        {
            tmp = Integer.toString(arr[i]);
            ch = tmp.toCharArray();
            boolean res = false;
            for (int j=0; j<ch.length; j++)                     //проходимся по каждой цифре в числе
            {
                if((ch[j] % 2 == 0) && (ch[j] != 0))
                {
                    res = true;
                }
            }
            if(res == true)
            {
                kolvo++;
            }
        }
        System.out.println("The amount of numbers with even numbers: " + kolvo);
    }
}
