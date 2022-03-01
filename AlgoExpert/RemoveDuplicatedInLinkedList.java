package AlgoExpert;

import java.util.*;

class Program {
  // This is an input class. Do not edit.
  public static class LinkedList {
    public int value;
    public LinkedList next;

    public LinkedList(int value) {
      this.value = value;
      this.next = null;
    }
  }

  public LinkedList removeDuplicatesFromLinkedList(LinkedList linkedList) {
		var cur = linkedList;
		while(cur != null){
			var next = cur.next;
			while(next != null && next.value == cur.value) next = next.next;
			cur.next = next;
			cur = next;
		}
    return linkedList;
  }
}




// 2 method --> not optimal


import java.util.*;

class Program {
  // This is an input class. Do not edit.
  public static class LinkedList {
    public int value;
    public LinkedList next;

    public LinkedList(int value) {
      this.value = value;
      this.next = null;
    }
  }

  public LinkedList removeDuplicatesFromLinkedList(LinkedList linkedList) {
    var list = new ArrayList<Integer>();
		list.add(linkedList.value);
		var head = linkedList;
		while(linkedList.next != null){
			if(!list.contains(linkedList.next.value)){
				list.add(linkedList.next.value);
				linkedList = linkedList.next;
			}else{
				linkedList.next = linkedList.next.next;
			}
		}
    return head;
  }
}
