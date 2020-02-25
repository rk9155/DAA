package DAA;
import java.util.*; 
import java.lang.*; 
import java.io.*; 

public class PrimsAlgorithm {

	   
	    private static final int V = 4; 
	 
	    int minKey(int key[], Boolean Set[]) 
	    { 
	        int min = Integer.MAX_VALUE, min_index = -1; 
	  
	        for (int v = 0; v < V; v++) 
	            if (Set[v] == false && key[v] < min) { 
	                min = key[v]; 
	                min_index = v; 
	            } 
	  
	        return min_index; 
	    } 
	  
	    
	    void print(int parent[], int graph[][]) 
	    { 
	        System.out.println("Edge \tWeight"); 
	        for (int i = 1; i < V; i++) 
	            System.out.println(parent[i] + " -> " + i + "\t" + graph[i][parent[i]]); 
	    } 
	  
	    void prim(int graph[][]) 
	    { 
	       
	        int parent[] = new int[V]; 
	  
	        int key[] = new int[V]; 
	  
	        Boolean Set[] = new Boolean[V]; 
	  
	        for (int i = 0; i < V; i++) { 
	            key[i] = Integer.MAX_VALUE; 
	            Set[i] = false; 
	        } 
	  
	        
	        key[0] = 0; 
	        parent[0] = -1; 
	        
	        for (int count = 0; count < V - 1; count++) { 
	             
	            int u = minKey(key, Set); 
	  
	            Set[u] = true; 
	  
	            for (int v = 0; v < V; v++) 
	  
	                 
	                if (graph[u][v] != 0 && Set[v] == false && graph[u][v] < key[v]) { 
	                    parent[v] = u; 
	                    key[v] = graph[u][v]; 
	                } 
	        } 
	  
	        print(parent, graph); 
	    } 
	  
	    public static void main(String[] args) 
	    { 
	    	PrimsAlgorithm t = new PrimsAlgorithm(); 
	        int graph[][] = new int[][] { { 0, 2, 0, 6 }, 
	                                      { 2, 0, 3, 8 }, 
	                                      { 0, 3, 0, 0 }, 
	                                      { 6, 8, 0, 0 }
	        };
	                                      
	        t.prim(graph); 
	    } 
	} 
	