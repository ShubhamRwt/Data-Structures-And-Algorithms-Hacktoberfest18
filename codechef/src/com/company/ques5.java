package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class ques5 {

    private class vertices{
        HashMap<Integer,Integer> nbrs=new HashMap<>();
    }
    HashMap<Integer, vertices> vtces;
    public ques5 (){
        vtces=new HashMap<>();
    }
    public void addvertices(Integer vname){
        vertices vtx=new vertices();
        vtces.put(vname,vtx);
    }
    public void addedge(Integer vname1,Integer vname2){
        vertices vtx1=vtces.get(vname1);
        vertices vtx2=vtces.get(vname2);
        if (vtx1==null||vtx2==null||vtx1.nbrs.containsKey(vname2)){
//            System.out.println("Edge already exist or vertix don't exist");

        }
        else {
            vtx1.nbrs.put(vname2,1);
            vtx2.nbrs.put(vname1,1);

        }

    }
    private  class pair{
        Integer vname;
        String psf;    //path so far
    }

    public ArrayList<ArrayList<Integer>> bftcomponent() {
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        LinkedList<pair> queue = new LinkedList<>();
        HashMap<Integer, Boolean> processed = new HashMap<>();
        ArrayList<Integer> keys = new ArrayList<>(vtces.keySet());
        for (Integer key : keys) {


            pair sp = new pair();
            sp.vname = key;
//            sp.psf = key;
            queue.addLast(sp);
            ArrayList<Integer> temp=new ArrayList<>();
            while (!queue.isEmpty()) {

                pair rp = queue.removeFirst();
                if (processed.containsKey(rp.vname)) {
                    continue;
                }
                temp.add(rp.vname);

                processed.put(rp.vname, true);

//                System.out.println(rp.vname+" "+rp.psf);

                vertices vtx = vtces.get(rp.vname);
                ArrayList<Integer> nbrs = new ArrayList<>(vtx.nbrs.keySet());
                for (Integer nbr : nbrs) {
                    if (!processed.containsKey(nbr)) {
                        pair np = new pair();
                        np.vname = nbr;
                        np.psf = rp.psf + nbr;
                        queue.addLast(np);
                    }

                }

            }
            if (temp.size()>0) {
                result.add(temp);
            }


        }
        return result;
    }







    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            ques5 graph = new ques5();
            int n = input.nextInt();
            for (int i = 1; i <= n; i++) {
                graph.addvertices(i);
            }
            int a[][] = new int[n + 1][n + 1];
            int m = input.nextInt();
            for (int i = 0; i < m; i++) {
                int vname1 = input.nextInt();
                int vname2 = input.nextInt();
                graph.addedge(vname1, vname2);
                a[vname1][vname2] = 1;
                a[vname1][0]++;
            }
            int flag = 1;
            ArrayList<ArrayList<Integer>> subgraph = graph.bftcomponent();
//        for (int i = 0; i <=n ; i++) {
//            for (int j = 0; j <=n ; j++) {
//                System.out.print(a[i][j]);
//
//            }
//            System.out.println();
//
//        }
//        ArrayList<Integer> components=new ArrayList<>();
            ArrayList<ArrayList<Integer>> set1 = new ArrayList<>();
            ArrayList<Integer> set2 = new ArrayList<>();
            for (ArrayList<Integer> comp : subgraph) {
                int temp = -1;
                for (int i = 0; i < comp.size(); i++) {

                    if (a[comp.get(i)][0] % 2 != 0) {

                        temp = comp.get(i);
                        comp.remove(i);
                        break;
                    }


                }
                if (temp != -1) {
//                System.out.println(temp);
                    set2.add(temp);
                    flag = 2;
                }
//            System.out.println(comp);
                set1.add(comp);

            }
            if (flag == 2) {
                System.out.println(2);
                int result[] = new int[n + 1];


                for (int i = 0; i < set2.size(); i++) {
                    result[set2.get(i)] = 2;
                }
                for (ArrayList<Integer> temp : set1) {

                    for (int i = 0; i < temp.size(); i++) {
                        result[temp.get(i)] = 1;

                    }

                }
                for (int i = 1; i <= n; i++) {
                    System.out.print(result[i] + " ");

                }


            } else {
                System.out.println(1);
                for (int i = 0; i < n; i++) {
                    System.out.print(1 + " ");

                }
            }


        }
    }
}
