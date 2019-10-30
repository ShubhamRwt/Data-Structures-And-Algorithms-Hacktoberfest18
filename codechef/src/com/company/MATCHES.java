package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class MATCHES {
    public static void main(String[] args) {
        HashMap<Integer,Integer> info=new HashMap<>();
        info.put(0,6);
        info.put(1,2);
        info.put(2,5);
        info.put(3,5);
        info.put(4,4);
        info.put(5,5);
        info.put(6,6);
        info.put(7,3);
        info.put(8,7);
        info.put(9,6);

        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        for (int i = 0; i <t ; i++) {
            int count=0;
            int a=input.nextInt();
            int b=input.nextInt();
            int c=a+b;
            while (c>0){
                int temp=c%10;
                count=count+info.get(temp);
                c=c/10;

            }
            System.out.println(count);


        }

    }

}
