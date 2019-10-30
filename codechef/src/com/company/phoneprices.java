package com.company;

import java.util.Scanner;

public class phoneprices {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();


        while (t-- > 0) {

            int result = 0;

            int n = input.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = input.nextInt();

            }

            for (int i = 0; i < n; i++) {


                int flag = 0;

                for (int j = i - 1; j >= i - 5; j--) {
                    if (j == -1) {

                        break;
                    }
                    if (a[i] >= a[j]) {
                        flag = 1;
                        break;
                    }

                }
                if (flag == 0) {
                    result++;
//
                    continue;
                }


            }


            System.out.println(result );

        }
    }
}
