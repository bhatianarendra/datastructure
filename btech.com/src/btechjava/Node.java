package btechjava;

//node is a class or can say user defined object   
//Having 2 values integer val and  node next (self)    

public class Node {
	// int x;    
	    int val;
	    Node next;  // NextNode is Node type object
	                   
	
	   
	   public Node(int val) { //constructor  (a method with same name as class name )  
		this.val = val;
		this.next = null;
	}
	
}