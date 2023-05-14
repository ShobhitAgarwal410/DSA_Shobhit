package trees;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

	static class Node {
		Node left;
		Node right;
		int data;

		Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

	static class TreeInfo {

		int height;
		int diameter;

		public TreeInfo(int height, int diameter) {
			this.height = height;
			this.diameter = diameter;
		}

	}

	public static void main(String[] args) {
		int[] nodes = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
		CreateBinaryTree tree = new CreateBinaryTree();
		Node root = tree.buildTree(nodes);
		System.out.println(" PRE-ORDER");
		tree.preOrder(root);
		System.out.println("\n IN-ORDER");
		tree.inOrder(root);
		System.out.println("\n POST-ORDER");
		tree.postOrder(root);
		System.out.println("\n LEVEL-ORDER");
		tree.levelOrder(root);
		System.out.println("\n COUNT-NODES");
		System.out.println(tree.countNodes(root));
		System.out.println("\n SUM-NODES");
		System.out.println(tree.sumOfNodes(root));
		System.out.println("\n Height of Tree");
		System.out.println(tree.heightOfTree(root));
		System.out.println("\n Diameter of Tree");
		System.out.println(tree.diameterOfTree(root));
		System.out.println("\n Diameter of Tree Optimised");
		System.out.println(tree.diameterOfTreeOptimised(root).diameter);
	}

	static class CreateBinaryTree {
		static int index = -1;

		public Node buildTree(int[] nodes) {
			index++;
			if (nodes[index] == -1) {
				return null;
			}
			Node newNode = new Node(nodes[index]);

			newNode.left = buildTree(nodes);
			newNode.right = buildTree(nodes);
			System.out.println(newNode.data);
			return newNode;
		}

		public int diameterOfTree(Node root) {
			if (root == null) {
				return 0;
			}
			int x = diameterOfTree(root.left);
			int y = diameterOfTree(root.right);
			int h = heightOfTree(root.left) + heightOfTree(root.right) + 1;
			return Math.max(h, Math.max(x, y));
		}

		public TreeInfo diameterOfTreeOptimised(Node root) {
			if (root == null) {
				return new TreeInfo(0, 0);
			}
			TreeInfo left = diameterOfTreeOptimised(root.left);
			TreeInfo right = diameterOfTreeOptimised(root.right);

			int myHeight = Math.max(left.height, right.height) + 1;
			int d1 = left.diameter;
			int d2 = right.diameter;
			int d3 = left.height + right.height + 1;
			return new TreeInfo(myHeight, Math.max(d3, Math.max(d1, d2)));
		}

		public int heightOfTree(Node root) {
			if (root == null) {
				return 0;
			}
			int x = heightOfTree(root.left);
			int y = heightOfTree(root.right);
			return Math.max(x, y) + 1;
		}

		public int sumOfNodes(Node root) {
			if (root == null) {
				return 0;
			}
			int x = sumOfNodes(root.left);
			int y = sumOfNodes(root.right);
			return x + y + root.data;
		}

		public int countNodes(Node root) {
			if (root == null) {
				return 0;
			}
			int x = countNodes(root.left);
			int y = countNodes(root.right);
			return x + y + 1;
		}

		public void levelOrder(Node root) {
			if (root == null) {
				return;
			}
			Queue<Node> q = new LinkedList<>();
			q.add(root);
			q.add(null);
			while (!q.isEmpty()) {
				Node currentNode = q.remove();
				if (currentNode == null) {
					System.out.println();
					if (q.isEmpty()) {
						break;
					} else {
						q.add(null);
					}
				} else {
					System.out.println(currentNode.data + " ");
					if (currentNode.left != null) {
						q.add(currentNode.left);
					}
					if (currentNode.right != null) {
						q.add(currentNode.right);
					}
				}
			}
		}

		public void preOrder(Node root) {
			if (root == null) {
				return;
			}
			System.out.print(root.data + " ");
			preOrder(root.left);
			preOrder(root.right);
		}

		public void inOrder(Node root) {
			if (root == null) {
				return;
			}
			inOrder(root.left);
			System.out.print(root.data + " ");
			inOrder(root.right);
		}

		public void postOrder(Node root) {
			if (root == null) {
				return;
			}
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.data + " ");

		}
	}
}
