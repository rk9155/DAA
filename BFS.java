package DAA;
import java.util.Queue;
import java.util.LinkedList;
class Node { 
    int data; 
    Node left, right; 
  
    public Node(int val) { 
        data = val; 
        left = null; 
        right = null; 
    } 
 } 

 public class BFS {   
	 
	  Node root; 
	  
	    void bfs()  
	    { 
	        Queue<Node> queue = new LinkedList<Node>(); 
	        queue.add(root); 
	        while (!queue.isEmpty())  
	        { 
	  
	            Node temp = queue.poll(); 
	            System.out.print(temp.data + " "); 
	  
	            if (temp.left != null) { 
	                queue.add(temp.left); 
	            } 
	  
	            if (temp.right != null) { 
	                queue.add(temp.right); 
	            } 
	        } 
	    } 
	  
	    public static void main(String args[])  
	    { 
	        
	        BFS tree = new BFS(); 
	        tree.root = new Node(1); 
	        tree.root.left = new Node(2); 
	        tree.root.right = new Node(3); 
	        tree.root.left.left = new Node(4); 
	        tree.root.left.right = new Node(5); 
	 
	        tree.bfs(); 
	    } 
	} 
 