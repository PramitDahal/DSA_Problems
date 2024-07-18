package Trees;


class Node {
	// defination of node
	int data;
	Node leftNode , rightNode;
	Node(int value){
		data = value;
		leftNode = rightNode = null;
	}
}

public class HeightofTree {
	
	Node rootNode;
	
	// method
	int maxHeight(Node node) {
		
		if (node == null) {
			return 0;
		}
		else {
			int leftHeight = maxHeight(node.leftNode);
			int rightHeight = maxHeight(node.rightNode);
			System.out.println("Value of leftNode "+leftHeight);
			System.out.println("Value of rightNode "+rightHeight);
			
			if(leftHeight > rightHeight) {
				return (leftHeight + 1);
			}else {
				return (rightHeight + 1);
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		HeightofTree tree = new HeightofTree();
		
		tree.rootNode = new Node(2);
		tree.rootNode.leftNode = new Node(3);
		tree.rootNode.rightNode = new Node(7);
		
		tree.rootNode.leftNode.leftNode = new Node(4);
		tree.rootNode.rightNode.leftNode = new Node(6);
		
		tree.rootNode.leftNode.rightNode = new Node(5);
		tree.rootNode.rightNode.rightNode = new Node(8);
		
		tree.rootNode.leftNode.rightNode.leftNode = new Node(10);
		
		System.out.println("The height of the tree is: "+tree.maxHeight(tree.rootNode));
		
//	        2
//	       / \
//	      3   7
//	     / \ / \
//	    4  5 6  8
//	       /
//	      10
		
		
		
	 
		
		
	}
	
	

}
