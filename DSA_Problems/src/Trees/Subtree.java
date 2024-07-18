package Trees;


class Node2 {
	// defination of node
	int data;
	Node2 leftNode , rightNode , nextNodes;
	Node2(int value){
		data = value;
		leftNode = rightNode = null;
	}
}

public class Subtree {
	// node define
	Node2 rootNode1 , rootNode2;
	
	boolean Identical(Node2 rootNode1,Node2 rootNode2) {
		
		if(rootNode1 == null && rootNode2 == null) {
			return true;
		}
		if(rootNode1 == null || rootNode2 == null) {
			return false;
		}
		
		return(rootNode1.data == rootNode2.data
				&& Identical(rootNode1.leftNode , rootNode2.leftNode)
				&& Identical(rootNode1.rightNode , rootNode2.rightNode));
		
	}
	
	boolean isSubtree(Node2 A , Node2 B) {
		
		if(A == null) {
			return false;
		}
		if(B == null) {
			return true;
		}
		if(Identical(A,B)) {
			return true;
		}
		
		
		return isSubtree(A.leftNode,B) || isSubtree(A.rightNode, B);
		
	}
	
	public static void main(String[] args) {
		
		Subtree tree2 = new Subtree();
		
		tree2.rootNode1 = new Node2(10);
		tree2.rootNode1.leftNode = new Node2(8);
		tree2.rootNode1.rightNode = new Node2(11);
		tree2.rootNode1.leftNode.leftNode = new Node2(2);
		tree2.rootNode1.leftNode.rightNode = new Node2(7);
		tree2.rootNode1.rightNode.leftNode = new Node2(13);
		tree2.rootNode1.rightNode.rightNode = new Node2(15);
		tree2.rootNode1.leftNode.leftNode.leftNode = new Node2(1);
		
		
		tree2.rootNode2 = new Node2(11);
		tree2.rootNode2.rightNode = new Node2(15);
		tree2.rootNode2.leftNode = new Node2(13);
		tree2.rootNode2.leftNode.leftNode = new Node2(7);
		
		if(tree2.isSubtree(tree2.rootNode1, tree2.rootNode2)) {
			System.out.println("The second tree is the subtree of the first tree");
		}else
		System.out.println("Not a Subtree");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
