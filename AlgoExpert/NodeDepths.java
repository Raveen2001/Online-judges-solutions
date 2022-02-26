package AlgoExpert;

import java.util.*;
class Program {

  public static int nodeDepths(BinaryTree root) {
		return nodeDepths(root, 0);
  }
	
	public static int nodeDepths(BinaryTree root, int level){
		if(root == null) return 0;	
		return level + nodeDepths(root.left, level + 1) + nodeDepths(root.right, level + 1);
	}

  static class BinaryTree {
    int value;
    BinaryTree left;
    BinaryTree right;

    public BinaryTree(int value) {
      this.value = value;
      left = null;
      right = null;
    }
  }
}
