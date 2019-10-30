package com.company;

import java.util.Scanner;

public class countinversion {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();

        while (t-->0){
            int n=input.nextInt();
            int k=input.nextInt();
            long a[]=new long[n];
            for (int i = 0; i <n ; i++) {
                a[i]=input.nextLong();

            }
            long copies=n*k;



            long sum=0;
            for (int i = 0; i <n ; i++) {
                long tempsum=0;
                int temp=0;
                int jtemp=i;
                while (temp<n){

                    if (a[i]>a[jtemp]){
                        tempsum++;
                    }
                    if (jtemp==n-1){
                        jtemp=0;
                        temp++;
                        continue;
                    }
                    jtemp++;
                    temp++;
                }

                long pair=(copies-i)/n;
//                sum=sum+tempsum*pair;
                long remain=copies-(i+pair*n);
                int extra=0;
                if (remain>0) {
                    for (int j = i; j < n; j++) {
                        if (a[i] > a[j]) {
                            extra++;
                        }

                    }
                }
//                sum=sum+extra;
                tempsum=tempsum;

                while (pair>0){
                    sum=sum+tempsum*pair;
                    sum=sum+extra;
                    pair--;

                }


            }
            System.out.println(sum);
        }
    }
}
