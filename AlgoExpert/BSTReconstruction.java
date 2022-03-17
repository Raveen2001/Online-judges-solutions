package AlgoExpert;

import java.util.*;

class Program {
  // This is an input class. Do not edit.
  static class BST {
    public int value;
    public BST left = null;
    public BST right = null;

    public BST(int value) {
      this.value = value;
    }
  }

  public BST reconstructBst(List<Integer> preOrderTraversalValues) {
    if(preOrderTraversalValues.isEmpty()) return null;
		int parentValue = preOrderTraversalValues.get(0);
    BST node = new BST(parentValue);
		int rightChildIdx = preOrderTraversalValues.size();
		for(int i = 1 ; i< preOrderTraversalValues.size(); i++){
			if(parentValue <= preOrderTraversalValues.get(i)){
				rightChildIdx = i;
				break;
			}
		}
		node.left = reconstructBst(preOrderTraversalValues.subList(1, rightChildIdx));
		node.right = reconstructBst(preOrderTraversalValues.subList(rightChildIdx, preOrderTraversalValues.size()));
		
		return node;
  }
}

