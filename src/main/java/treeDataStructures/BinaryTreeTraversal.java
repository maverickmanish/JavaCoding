package treeDataStructures;

import java.util.LinkedList;
import java.util.Queue;

class Node {
	private int Key;
	private Node L;
	private Node R;

	public Node(int key) {
		super();
		this.Key = key;
		L = R = null;
	}

	public int getKey() {
		return Key;
	}

	public void setKey(int key) {
		Key = key;
	}

	public Node getL() {
		return L;
	}

	public void setL(Node l) {
		L = l;
	}

	public Node getR() {
		return R;
	}

	public void setR(Node r) {
		R = r;
	}

}

class BinaryTree {
	private Node root;

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}

	public BinaryTree() {
		super();
		this.root = null;
	}

	public BinaryTree(Node root) {
		super();
		this.root = root;
	}

	void inOrderTraversal(Node node) {
		if (node == null)
			return;
		inOrderTraversal(node.getL());
		System.out.print(node.getKey() + " ");
		inOrderTraversal(node.getR());

	}

	void preOrderTraversal(Node node) {
		if (node == null)
			return;
		System.out.print(node.getKey() + " ");
		inOrderTraversal(node.getL());
		inOrderTraversal(node.getR());

	}

	void postOrderTraversal(Node node) {
		if (node == null)
			return;
		inOrderTraversal(node.getL());
		inOrderTraversal(node.getR());
		System.out.print(node.getKey() + " ");
	}

	void breadthFirstTraversal(Node node) {
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(node);
		while (!queue.isEmpty()) {

			/*
			 */
			Node tempNode = queue.poll();
			System.out.print(tempNode.getKey() + " ");

			/* Enqueue left child */
			if (tempNode.getL() != null) {
				queue.add(tempNode.getL());
			}

			/* Enqueue right child */
			if (tempNode.getR() != null) {
				queue.add(tempNode.getR());
			}
		}
	}

}

public class BinaryTreeTraversal {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();

		tree.setRoot(new Node(1));
		tree.getRoot().setL(new Node(2));
		tree.getRoot().setR(new Node(3));
		tree.getRoot().getL().setL(new Node(4));
		tree.getRoot().getL().setR(new Node(5));

		System.out.println("Preorder traversal of binary tree is ");
		tree.preOrderTraversal(tree.getRoot());

		System.out.println("\nInorder traversal of binary tree is ");
		tree.inOrderTraversal(tree.getRoot());

		System.out.println("\nPostorder traversal of binary tree is ");
		tree.postOrderTraversal(tree.getRoot());

		System.out.println("\nLevel Order traversal of binary tree is ");
		tree.breadthFirstTraversal(tree.getRoot());

	}

}
