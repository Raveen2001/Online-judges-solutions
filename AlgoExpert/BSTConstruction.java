package AlgoExpert;

import java.util.*;

class Program {
  static class BST {
    public int value;
    public BST left;
    public BST right;

    public BST(int value) {
      this.value = value;
    }

    public BST insert(int value) {

      if(value < this.value){
				if(left == null){
					left = new BST(value);
				}else{
					left = left.insert(value);
				}
			}else{
				if(right == null){
					right = new BST(value);
				}else{
					right = right.insert(value);
				}
			}
      return this;
    }

    public boolean contains(int value) {
      if(value == this.value) return true;
			else if(value < this.value){
				if(left == null) return false;
				return left.contains(value);
			}else{
				if(right == null) return false;
				return right.contains(value);
			}
    }

    public BST remove(int value) {
      return remove(value, null);
    }
		
		public BST remove(int value, BST parent){
			
			if(value == this.value){
				if(left != null && right != null){
					this.value = right.findMin();
					right.remove(this.value, this);
				}else if(left != null){
					BST temp = left;
					this.value = temp.value;
					left = temp.left;
					right = temp.right;
				}else if(right != null){
					BST temp = right;
					this.value = temp.value;
					left = temp.left;
					right = temp.right;
				}else{
					if(parent == null) return null;
					if(parent.left != null && parent.left.value == value) parent.left = null;
					else parent.right = null;
				}
			}else if(value < this.value){
				if(left == null) return this;
				left.remove(value, this);
			}else{
				if(right == null) return this;
				right.remove(value, this);
			}
      return this;
		}
		
		public int findMin(){
			if(left != null){
				return left.findMin();
			}
			return this.value;
		}
		
		public int findMax(){
			if(right != null){
				return right.findMax();
			}
			return this.value;
		}
  }
}
