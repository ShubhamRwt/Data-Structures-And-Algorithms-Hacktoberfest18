package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class graphs {
    private class vertices{
        HashMap<String,Integer> nbrs=new HashMap<>();
    }
    HashMap<String,vertices> vtces;
    public graphs (){
        vtces=new HashMap<>();
    }
    public int numvertices(){
        return this.vtces.size();
    }
    public boolean ispresent(String key){
        if (vtces.containsKey(key)) {
            return true;
        }
        return false;
    }
    public void addvertices(String vname){
        vertices vtx=new vertices();
        vtces.put(vname,vtx);
    }
    public int noofedge(){
        int count=0;
        ArrayList<String> keys=new ArrayList<>(vtces.keySet());
        for (String key: keys) {
            count=count+vtces.get(key).nbrs.size();

        }
        return count/2;
    }
    public boolean containsedge(String vname1,String vname2){
        vertices vtx1=vtces.get(vname1);
        vertices vtx2=vtces.get(vname2);
        if (vtx1==null||vtx2==null|| !vtx1.nbrs.containsKey(vname2)){
            return false;
        }
        return true;
    }
    public void addedge(String vname1,String vname2,int cost){
        vertices vtx1=vtces.get(vname1);
        vertices vtx2=vtces.get(vname2);
        if (vtx1==null||vtx2==null||vtx1.nbrs.containsKey(vname2)){
            System.out.println("Edge already exist or vertix don't exist");

        }
        else {
            vtx1.nbrs.put(vname2,cost);
            vtx2.nbrs.put(vname1,cost);

        }

    }
    public boolean hashpath(String vname1,String vname2){
        if (containsedge(vname1,vname2)){
            return true;
        }
         vertices vtx=vtces.get(vname1);
         ArrayList<String> keys=new ArrayList<>(vtx.nbrs.keySet());
        for (String key:keys) {
            if (hashpath(key,vname2));

        }
        return false;


    }
    //BFS
    private  class pair{
        String vname;
        String psf;    //path so far
    }
    public boolean bfs(String src,String dst){
        LinkedList<pair> queue=new LinkedList<>();
        HashMap<String,Boolean> processed=new HashMap<>();
        pair sp=new pair();
        sp.vname=src;
        sp.psf=src;
        queue.addLast(sp);
        while (!queue.isEmpty()){

            pair rp=queue.removeFirst();
            if (processed.containsKey(rp)){
                continue;
            }
            processed.put(rp.vname,true);
            if(containsedge(rp.vname,dst)){
                return true;
            }
            vertices vtx=vtces.get(rp.vname);
            ArrayList<String> nbrs=new ArrayList<>(vtx.nbrs.keySet());
            for (String nbr:nbrs) {
                if (!processed.containsKey(nbr)){
                    pair np=new pair();
                    np.vname=nbr;
                    np.psf=rp.psf+nbr;
                    queue.addLast(np);
                }

            }

        }
        return false;

    }
    //BFT

    public void bft(String src,String dst) {
        LinkedList<pair> queue = new LinkedList<>();
        HashMap<String, Boolean> processed = new HashMap<>();
        ArrayList<String> keys = new ArrayList<>(vtces.keySet());
        for (String key : keys) {


            pair sp = new pair();
            sp.vname = key;
            sp.psf = key;
            queue.addLast(sp);
            while (!queue.isEmpty()) {

                pair rp = queue.removeFirst();
                if (processed.containsKey(rp)) {
                    continue;
                }
                processed.put(rp.vname, true);
                System.out.println(rp.vname+" "+rp.psf);
                vertices vtx = vtces.get(rp.vname);
                ArrayList<String> nbrs = new ArrayList<>(vtx.nbrs.keySet());
                for (String nbr : nbrs) {
                    if (!processed.containsKey(nbr)) {
                        pair np = new pair();
                        np.vname = nbr;
                        np.psf = rp.psf + nbr;
                        queue.addLast(np);
                    }

                }

            }


        }
    }

}
