package Trees;

import java.util.*;

class Node1{
	int data;
	Node1 leftNode1 , rightNode1;
	public Node1(int item) {
		data = item;
		leftNode1 = rightNode1 = null;
	}
}

public class BFS_traversal {
	// assignment -> DFT
   // BFS ->  
	
	Node1 rootNode1;
	void traversal() {
		if(rootNode1 == null) {
			return;
		}
		
		Queue<Node1> queue = new LinkedList<>();
		queue.add(rootNode1);
		
		// traverse
		while(!queue.isEmpty()) {
			Node1 tempNode1 = queue.poll();
			System.out.print(tempNode1.data + " ");
			
			if(tempNode1.leftNode1 != null) {
				queue.add(tempNode1.leftNode1);
			}
			
			if(tempNode1.rightNode1 != null) {
				queue.add(tempNode1.rightNode1);
			}
		}
	}
	
	public static void main(String[] args) {
		
		BFS_traversal tree1 = new BFS_traversal();
		
		tree1.rootNode1 = new Node1(10);
		tree1.rootNode1.leftNode1 = new Node1(8);
		tree1.rootNode1.rightNode1 = new Node1(11);
		
		tree1.rootNode1.rightNode1.rightNode1 = new Node1(15);
		tree1.rootNode1.rightNode1.leftNode1 = new Node1(13);
		
		tree1.rootNode1.leftNode1.rightNode1 = new Node1(7);
		tree1.rootNode1.leftNode1.leftNode1 = new Node1(2);
		
		tree1.rootNode1.leftNode1.leftNode1.leftNode1 = new Node1(1);
		
		System.out.println("The breadth traversal of the tree is ");
		tree1.traversal();
		
		
		
		
		
		
		
		
		
		
		
	}
}
