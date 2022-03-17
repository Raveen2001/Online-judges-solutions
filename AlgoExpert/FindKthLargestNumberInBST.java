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
	
	class TreeInfo{
		int noOfNodesVisited;
		int lastVisitedNodeValue;
		TreeInfo(int noOfNodesVisited, int lastVisitedNodeValue){
			this.noOfNodesVisited = noOfNodesVisited;
			this.lastVisitedNodeValue = lastVisitedNodeValue;
		}
	}

  public int findKthLargestValueInBst(BST tree, int k) {
    List<Integer> treeElementsInDescendingOrder = new ArrayList<>();
		TreeInfo info = new TreeInfo(0, -1);
		inOrderTraverse(tree, treeElementsInDescendingOrder, k, info);
		return info.lastVisitedNodeValue;
	}
	
	public void inOrderTraverse(BST tree, List<Integer> array,int k, TreeInfo info){
		if(tree == null || info.noOfNodesVisited == k) return;
		inOrderTraverse(tree.right, array, k, info);
		if(info.noOfNodesVisited < k){
			info.noOfNodesVisited ++;
			info.lastVisitedNodeValue = tree.value;
			inOrderTraverse(tree.left, array, k, info);
		}
	}
}

