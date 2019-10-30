package com.company;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.Scanner;

public class ques3 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        ArrayList<Integer> arrayList=new ArrayList<>();
        for (int i = 0; i <n ; i++) {
            arrayList.add(input.nextInt());
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        int q1=input.nextInt();
        int p1=input.nextInt();
//        map.put(q,p);
//        HashMap<Integer,Integer> map1=new HashMap<>();

        int  q2=input.nextInt();
        int p2=input.nextInt();
//        map1.put(q,p);
        boolean temp=true;



        while (arrayList.size()!=1){
            int indexa=checkfirstmin(arrayList);
            int a=arrayList.remove(indexa);

            int indexb=chcksecondmin(arrayList);
            int b=arrayList.remove(indexb);
            if (temp==true){
                if (q1==1){
                    arrayList.add((a+b)+p1);
                }
                if (q1==2){
                    arrayList.add((a-b)+p1);
                }
                temp=false;
                continue;

            }
            if (temp==false) {

                if (q2 == 1) {
                    arrayList.add((a + b) + p2);
                }
                if (q2 == 2) {
                    arrayList.add((a - b) + p2);
                }
                temp=true;
            }
//            temp=true;


        }
        System.out.println(arrayList.get(0));

    }

    private static int chcksecondmin(ArrayList<Integer> arrayList) {
        int index=0;
        int min=0;
        for (int i = 0; i <arrayList.size() ; i++) {
            if (arrayList.get(i)<min){
                index=i;
                min=arrayList.get(i);
            }


        }
        return index;
    }

    private static int checkfirstmin(ArrayList<Integer> arrayList) {
        int index=0;
        int min=0;
        for (int i = 0; i <arrayList.size() ; i++) {
            if (arrayList.get(i)<min){
                index=i;
                min=arrayList.get(i);
            }


        }
        return index;
    }
}
