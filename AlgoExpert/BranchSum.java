package AlgoExpert;

import java.util.*;

class Program {
  // This is the class of the input root. Do not edit it.
  public static class BinaryTree {
    int value;
    BinaryTree left;
    BinaryTree right;

    BinaryTree(int value) {
      this.value = value;
      this.left = null;
      this.right = null;
    }
  }

  public static List<Integer> branchSums(BinaryTree root) {
		List<Integer> sums = new ArrayList<Integer>();
    // Write your code here.
    branchSums(root, 0, sums);
		return sums;
  }
	public static void branchSums(BinaryTree root, int sum, List<Integer> res){
		if(root == null) return;
		sum += root.value;
		branchSums(root.left, sum, res);
		branchSums(root.right, sum, res);
		if(root.left == null && root.right == null){
			res.add(sum);			
		}
		return;
	}
}


