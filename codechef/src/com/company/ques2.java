package com.company;

import java.util.Scanner;

public class ques2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        int count=0;
        while (t-->0) {
            int a = input.nextInt();
            int b = input.nextInt();
            int araay[]=new int[b+1];
            for (int i = a; i <b+1 ; i++) {
                araay[i]=i;
            }

            for (int i = a; i <=b ; i++) {
                if (i==1){
                    continue;
                }

                if (araay[i]!=0){
                    count++;

                }
                int j=i;
                int temp=2;
                while (j*temp<=b){
                    araay[j*temp]=0;
                    temp++;
                }


            }
            System.out.println(count);

            }



        }
    }


