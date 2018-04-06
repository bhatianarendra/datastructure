package btechjava;


public class Application {

public static void main(String[] args) {
		
		// root is a variable of node type 
		//Node NodeObject = new Node(1);
		
		// link is a variable(object)  of LinkList type
		
		LinkedList link = new LinkedList();  // first node (or root node)  of LinkList ..
		
	//	NodeObject = new Node(117);
		link.insert(1);
		
		//or can directly pass node object like below
	  link.insert(117);
		link.insert(2);
		
		link.insert(3);
		link.insert(3);
		link.insert(3);
		link.search(117);
		link.delete(117);
		link.search(117);
		
		//LinkedList2 link2 = new LinkedList2(root);
		//link2.insert(new Node(21));
		
		
		//NodeStr ns = new NodeStr("kk");
		
		//ns.test();
		
		 
	}

}
