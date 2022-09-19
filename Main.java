package com.greatlearning.question2.main;

import com.greatlearning.question2.service.Node;
import com.greatlearning.question2.service.Service;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Service obj = new Service();
		Node node;
		
		node = new Node(50);
		node.left = new Node(30);
		node.right = new Node(60);
		node.left.right = new Node(10);
		node.right.left = new Node(55);
		
		Node rightSkewedTree = obj.completeBSTtoSkewed(node);
		System.out.println("The resultant output is : ");
		obj.traverseRightSkewedTree(rightSkewedTree);

	}

}
