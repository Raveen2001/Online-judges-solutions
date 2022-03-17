package AlgoExpert;
import java.util.*;

class Program {
  public static BST minHeightBst(List<Integer> array) {
		
		if(array.isEmpty()) return null;
  	int mid = array.size() / 2;
		int midValue = array.get(mid);
		BST node = new BST(midValue);
		node.left = minHeightBst(array.subList(0, mid));
		node.right = minHeightBst(array.subList(mid+1, array.size()));
    return node;
  }

  static class BST {
    public int value;
    public BST left;
    public BST right;

    public BST(int value) {
      this.value = value;
      left = null;
      right = null;
    }

    public void insert(int value) {
      if (value < this.value) {
        if (left == null) {
          left = new BST(value);
        } else {
          left.insert(value);
        }
      } else {
        if (right == null) {
          right = new BST(value);
        } else {
          right.insert(value);
        }
      }
    }
  }
}




// space optimized 
import java.util.*;

class Program {
  public static BST minHeightBst(List<Integer> array) {
		return minHeightBst(array, 0, array.size() - 1);
  }
	
	
	public static BST minHeightBst(List<Integer> array, int startIdx, int endIdx){
		if(startIdx > endIdx) return null;
  	int mid = (startIdx + endIdx) / 2;
		int midValue = array.get(mid);
		BST node = new BST(midValue);
		node.left = minHeightBst(array, startIdx, mid - 1);
		node.right = minHeightBst(array, mid + 1, endIdx);
    return node;
	}

  static class BST {
    public int value;
    public BST left;
    public BST right;

    public BST(int value) {
      this.value = value;
      left = null;
      right = null;
    }

    public void insert(int value) {
      if (value < this.value) {
        if (left == null) {
          left = new BST(value);
        } else {
          left.insert(value);
        }
      } else {
        if (right == null) {
          right = new BST(value);
        } else {
          right.insert(value);
        }
      }
    }
  }
}
