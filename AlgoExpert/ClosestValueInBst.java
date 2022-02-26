package AlgoExpert;
import java.util.*;

class Program {
  public static int findClosestValueInBst(BST tree, int target) {
		int closest = tree.value;
   	while(tree != null){
			if(Math.abs(closest - target) > Math.abs(tree.value - target)){
				closest = tree.value;
			}
			if(tree.value > target){
				tree = tree.left;
			}else if(tree.value < target){
				tree = tree.right;
			}else{
				break;
			}
		}
    return closest;
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
