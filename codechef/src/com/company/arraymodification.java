package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class arraymodification {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for (int j = 0; j < t; j++) {


            int n = input.nextInt();
           long k=input.nextLong();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = input.nextInt();

            }


            int temp = 3 * n;
            if (k>temp) {
               k=k%temp;

                if (n%2!=0){
                    a[(n/2)]=0;
                }

            }

            for (int i = 0; i < k; i++) {
                int x = i % n;
                int y = n - x - 1;
                a[x] = a[x] ^ a[y];


            }
            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + " ");

            }


        }
    }
}
