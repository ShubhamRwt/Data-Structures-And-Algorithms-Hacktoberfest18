package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ques4 {
    public static void main (String[] args) {


        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        for (int k = 0; k <t ; k++) {


            int n = input.nextInt();

            int a[] = new int[n];
            int max=0;
            for (int i = 0; i <n ; i++) {
                a[i]=input.nextInt();
                if (a[i]>max){
                    max=a[i];

                }
            }
            int factors[]=new int[max+1];
            int starvalue=0;
//            ArrayList<Integer> temp=new ArrayList<>();
            for (int i = 0; i <n ; i++) {
                if (starvalue<factors[a[i]]){
                    starvalue=factors[a[i]];
                }
                for (int j=1; j<=Math.sqrt(a[i]); j++)
                {
                    if (a[i]%j==0)
                    {
                        // If divisors are equal, print only one
                        if (a[i]/j == j) {
//                            System.out.printf("%d ", i);
                            factors[j]++;
                        }

                        else // Otherwise print both
                        {
//                            System.out.printf("%d %d ", i, n / i);
                            factors[j]++;
                            factors[a[i]/j]++;
                        }
                    }
                }





            }
//            System.out.println(Arrays.toString(factors));
            System.out.println(starvalue);

        }

    }

}
