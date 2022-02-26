package AlgoExpert;


class Program {
	
	static int sum = 0;

  public static int nodeDepths(BinaryTree root) {
		sum = 0;
		nodeDepths(root, 0);
		return sum;
  }
	
	public static void nodeDepths(BinaryTree root, int level){
		if(root == null) return;	
		nodeDepths(root.left, level + 1);
		nodeDepths(root.right, level + 1);
		sum += level;
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
