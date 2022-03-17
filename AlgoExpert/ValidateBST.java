package AlgoExpert;

import java.util.*;

class Program {
  public static boolean validateBst(BST tree) {
    // Write your code here.
		
    return validateBst(tree, Integer.MIN_VALUE, Integer.MAX_VALUE);
  }
	
	private static boolean validateBst(BST tree, int min, int max){
		if(tree == null) return true;
		if(tree.value >= min && tree.value < max){
			return validateBst(tree.left, min, tree.value) && validateBst(tree.right, tree.value, max);
		}else{
			return false;
		}
	}

  static class BST {
    public int value;
    public BST left;
    public BST right;

    public BST(int value) {
      this.value = value;
    }
  }
}
