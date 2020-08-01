
class Node{
	int key;
	Node left,right;
	public Node(int data) {
		key=data;
		left=right=null;
	}
}
public class Tree {
	public static void main(String args[]) {
		Node root = new Node(1);
		Node rc_1 = new Node(2);
		root.left=rc_1;
		Node rc_2 =  new Node(3);
		root.right = rc_2;
		Tree ob = new Tree();
		ob.print_tree(root);
	}
	public void print_tree(Node root) {
		Node r=root;
		
	}

}
