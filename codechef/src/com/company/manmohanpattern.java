package com.company;

import java.util.Scanner;

public class manmohanpattern {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        for (int i = 0; i <n ; i++) {
            if (i==0){
                System.out.println(1);
                continue;
            }

            for (int j = 0; j <= i; j++) {



                if (j == 0 || j == i) {
                    System.out.print(i);
                    continue;
                }
                System.out.print(0);
            }
            System.out.println();

        }

    }
}
