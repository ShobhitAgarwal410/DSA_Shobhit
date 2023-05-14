package trees;

import java.util.HashMap;

public class TreeFromINandPreOrder {
	static HashMap<Integer, Integer> hm = new HashMap<>();

	public static void main(String[] args) {
		int preorder[] = { 3, 9, 20, 15, 7 };
		int inorder[] = { 9, 3, 15, 20, 7 };
		TreeNode tree = buildTree(preorder, inorder);
		System.out.println(tree);
	}

	public static TreeNode buildTree(int[] preorder, int[] inorder) {
		for (int i = 0; i < inorder.length; i++) {
			hm.put(inorder[i], i);
		}
		return build(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
	}

	private static TreeNode build(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd) {
		if (preStart > preEnd || inStart > inEnd) {
			return null;
		}

		TreeNode root = new TreeNode(preorder[preStart]);

		if (preStart == preEnd) {
			return root;
		}
		int index = hm.get(root.val);
		int numsLeft = index - inStart;

		root.left = build(preorder, preStart + 1, preStart + numsLeft, inorder, inStart, index - 1);
		root.right = build(preorder, preStart + numsLeft + 1, preEnd, inorder, index + 1, inEnd);
		return root;
	}

	public TreeNode solve(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd,
			HashMap<Integer, Integer> map) {

		if (preStart > preEnd || inStart > inEnd)
			return null;

		TreeNode root = new TreeNode(preorder[preStart]);

		int inRoot = map.get(root.val);
		int numsLeft = inRoot - inStart;

		root.left = solve(preorder, preStart + 1, preStart + numsLeft, inorder, inStart, inRoot - 1, map);
		root.right = solve(preorder, preStart + numsLeft + 1, preEnd, inorder, inRoot + 1, inEnd, map);

		return root;

	}

}
