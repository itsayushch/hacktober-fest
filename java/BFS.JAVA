import java.util.*;
class Graph{
    ArrayList<ArrayList<Integer> > graph;
    int V;
    Graph(int nodes){
        V=nodes;
        graph=new  ArrayList<ArrayList<Integer> >();
        for(int i=0;i<V;i++){
            graph.add(new ArrayList<Integer>());
        }
    }
    void addEdge(int u,int v){
        graph.get(v).add(u);
        graph.get(u).add(v);
    }
    void printGraph(){
        for(int i=0;i<V;i++){
            System.out.println("Node:"+i);
            for(int x:graph.get(i))
            {
                System.out.print("-> "+x);
            }
             System.out.println();
        }
    }
    public void BFS(int start){
        boolean visited[]=new boolean[V];
        Queue<Integer>q=new LinkedList<Integer>();
        q.add(start);
        System.out.println("BFS TRAVERSAL:");
        visited[start]=true;
        while(q.isEmpty()==false){
            int node=q.poll();
            System.out.print(node+" ");
            for(int x:graph.get(node)){
                if(visited[x]==false){
                    visited[x]=true;
                    q.add(x);
                }
            }
        }
    }
}

class Main {


	public static void main(String[] args)
	{
		Graph g=new Graph(5);
		g.addEdge(0, 1);
		g.addEdge(0, 4);
		g.addEdge(1, 2);
		g.addEdge(1, 3);
		g.addEdge(1, 4);
		g.addEdge(2, 3);
		g.addEdge(3, 4);
		
		g.printGraph();
		g.BFS(0);
	}
}

codelink:https://ide.geeksforgeeks.org/mEZsVV8E01
/*package whatever //do not write package name here */

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    static  ArrayList<ArrayList<Integer>>adj;
   public static void bfs(int start,int V){
       boolean visited[]=new boolean[V];
       visited[start]=true;
       Queue<Integer>q=new LinkedList<Integer>();
        q.add(start);
        System.out.println("BFS TRAVERSAL:");
       while(q.isEmpty()==false){
           int node=q.poll();
       System.out.print(node+" ");
       for(int x:adj.get(node))
       if(visited[x]==false){
           visited[x]=true;
           q.add(x);
       }
       }
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
	    bfs(0,V);
	    }
	
	}
}
