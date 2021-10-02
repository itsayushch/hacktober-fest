/*package whatever //do not write package name here */

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    static  ArrayList<ArrayList<Integer>>adj;
    public static void dfsutil(int node,boolean visited[]){
        visited[node]=true;
        System.out.println(node+" ");
        for(int x:adj.get(node)){
            if(visited[x]==false){
                dfsutil(x,visited);
            }
        }
    }
    public static void Dfs(int start,int V){
        boolean visited[]=new boolean[V];
          System.out.println("DFS TRAVERSAL");
        dfsutil(start,visited);
    }
	public static void main (String[] args) {
	    Scanner in=new Scanner(System.in);
	    int t=in.nextInt();
	    while(t-->0){
	       adj=new ArrayList<>();
	    int V=in.nextInt();
	    int E=in.nextInt();
	    for(int i=0;i<V;i++){
	     adj.add(new ArrayList<Integer>());
	    }
	    for(int i=0;i<E;i++){
	        int u=in.nextInt();
	        int v=in.nextInt();
	        adj.get(u).add(v);
	        adj.get(v).add(u);
	    }
	    for(int i=0;i<V;i++){
	        System.out.println("Node: "+i);
	        for(int x:adj.get(i)) System.out.print("->"+x);
	        System.out.println();
	    }
	    System.out.println("BFS TRAVERSAL:");
	    Dfs(0,V);
	    }
	
	}
}
