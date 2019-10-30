package com.company;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Scanner;

import java.math.BigInteger;

public class Main {



        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
//        BigInteger n=new BigInteger(input.next());

            int testcase = input.nextInt();
            for (int k = 0; k < testcase; k++) {


                long n = input.nextInt();
                BigInteger mem[] = new BigInteger[60 + 1];
                ArrayList<Integer> arr=new ArrayList<>();
//                fibocalc(mem, 60);
                mem[0] = BigInteger.ZERO;
                mem[1] = BigInteger.ONE;
                arr.add(0);
                for (int i = 0; i <60; i++) {
                    mem[i] = mem[i].remainder(BigInteger.TEN);
                    arr.add(Integer.parseInt(mem[i]+""));

                }
                int a[]=new int[60];
                a[0]=0;a[2]=1;a[4]=2;a[8]=3;a[16]=0;a[32]=9;
                int c = 2;
                int count = 2;
                int index;
                int p = (int)(Math.log(n) /
                        Math.log(2));
                index=(int)Math.pow(2, p);
//                while (true) {
//                    int temp = (int) Math.pow(2, count);
//                    if (temp >= n) {
//                        break;
//                    }
//                    count++;
//
//                }
//                if (n == (int) Math.pow(2, count)) {
//                     index = (int) Math.pow(2, count);
//
////                    System.out.println((mem[index-1].remainder(BigInteger.TEN)));
//
//                } else {
//                     index = (int) Math.pow(2, count - 1);
////                    System.out.println((mem[index-1].remainder(BigInteger.TEN)));
//
//                }
                int rem=index%60;
                System.out.println(a[rem]);


            }


            }






    private static BigInteger fibocalc(BigInteger mem[],int n) {
            if (n<2){
                return new BigInteger(Integer.toString(n));
            }
            if (mem[n]!=null){
                return mem[n];
            }
            mem[n]=fibocalc(mem,n-1).add(fibocalc(mem,n-2));

            return mem[n];
        }
    }

