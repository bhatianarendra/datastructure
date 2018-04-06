package btechjava;


public class LinkedList {
	private Node root;                        // root is node type object
	private int size;
	
	public LinkedList(){  // constructor
		this.root = null;
		this.size = 0;
	}


	public int getSize() {
		return size;
	}

	public class Node {
		// int x;
		private int val;
		private Node next;  // NextNode is Node type object



		public Node(int val) { //constructor  (a method with same name as class name )
			this.val = val;
			this.next = null;
		}

	}

   

	//delete

	public void delete(int val) {

		Node node = root;
		Node prev = null;

		//root check
		while(root.val==val) {
			root = root.next;
			System.out.println("deleting node with val " + val);
		}

		while(node!=null) {
			if(node.val==val) { //delete condition
				 System.out.println("deleting node with val " + val);
				 prev.next = node.next;
				size--;
			}
			prev = node;
			node = node.next;
		}

	}

	//search
	public void search(int val) {
		//if root ++null return exception
		Node node = root;
		int pos = 0;
		while(node != null) {
			pos++;
			if(node.val == val)
				System.out.println("Found value "+ val + " at position "+ pos);
			node = node.next;
		}
	}


	//insert
	public void insert(int val) {
		Node n = new Node(val);
		Node start = root;             // start  is Node type object

		if (root == null) {     // root is a object with 2 values .. i.e. both values are null
			root = n;         // first node become root
			size++;
			return;
		}
		// i.e root is not null so looking for last element of start
		while (start.next != null) {
			start = start.next;
		}
		start.next = n;
	}
	
	
	public static void main(String[] args) {

		// root is a variable of node type
		//Node NodeObject = new Node(1);

		// link is a variable(object)  of LinkList type

		LinkedList link = new LinkedList();  // initilized linklist object link  with two values root=null  & size =0

		//	NodeObject = new Node(117);
		link.insert(11);                       //  create two node n (value = 11 , next =null) and  start = root (first time it is null)
		link.insert(15);
		//or can directly pass node object like below
		link.insert(117);
		link.insert(2);

		link.insert(3);
		link.insert(3);
		link.insert(117);
		link.search(117);
		link.delete(117);
		link.search(117);

		System.out.println( link.getSize());

		//LinkedList2 link2 = new LinkedList2(root);
		//link2.insert(new Node(21));


		//NodeStr ns = new NodeStr("kk");

		//ns.test();


	}

}

