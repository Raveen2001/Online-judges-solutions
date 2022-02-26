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
    // Write your code here.
    return branchSums(root, 0, new ArrayList<Integer>());
  }
	
	public static List<Integer> branchSums(BinaryTree root, int sum, List<Integer> res){
		sum += root.value;
		if(root.left != null){
			branchSums(root.left, sum, res);
		}
		if(root.right != null){
			branchSums(root.right, sum, res);
		}
		if(root.left == null && root.right == null){
			res.add(sum);			
		}
		return res;
	}
}

