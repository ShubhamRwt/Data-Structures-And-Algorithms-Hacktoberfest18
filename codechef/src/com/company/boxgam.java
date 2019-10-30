package com.company;

import java.util.Scanner;

public class boxgam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            long k = input.nextLong();
            int p = input.nextInt();
            long a[] = new long[n];
            int min = 0;
            int max = 0;
            for (int i = 0; i < n; i++) {
                a[i] = input.nextLong();
                if (a[i] < a[min]) {
                    min = i;
                }
                if (a[i] > a[max]) {
                    max = i;
                }

            }

            if (p == 0) {
                if (k % 2 == 0) {
                    if (max != 0 && max != n - 1) {
                        if (min>max){
                            System.out.println(a[max+1]);

                        } else System.out.println(a[max - 1]);
                    }
                    if (max == 0) {
                        System.out.println(a[1]);
                    }
                    if (max == n - 1) {
                        System.out.println(a[n - 2]);
                    }
                } else {
                    System.out.println(a[max]);
                }
            } else if (p == 1) {
                if (k % 2 == 0) {
                    if (min != 0 && min != n - 1) {
                        if(max>min) {
                            System.out.println(a[min + 1]);
                        }
                            else{
                        } System.out.println(a[min - 1]);
                    }
                    if (min == 0) {
                        System.out.println(a[1]);
                    }
                    if (min == n - 1) {
                        System.out.println(a[n - 2]);
                    }
                } else {
                    System.out.println(a[min]);
                }

            }
        }
    }
}
