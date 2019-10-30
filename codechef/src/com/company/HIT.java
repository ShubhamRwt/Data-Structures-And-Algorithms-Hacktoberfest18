package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class HIT {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while (t-->0){
            int n=input.nextInt();
            int range=n/4;
            int a[]=new int[n+1];
            for (int i = 1; i <=n ; i++) {
                a[i]=input.nextInt();
            }
            Arrays.sort(a);
            int x;
            if (a[range]!=a[range+1]){
                x=a[range+1];
            }
            else
            {
                System.out.println("-1");
                continue;
            }
            int y;
            if (a[range*2]!=a[2*range+1]){
                y=a[range*2+1];
            }
            else {
                System.out.println("-1");
                continue;
            }
            int z;
            if (a[range*3]!=a[range*3+1]){
                z=a[range*3+1];
            }
            else {
                System.out.println("-1");
                continue;
            }
            System.out.println(x+" "+y+" "+z);

        }
    }
}
