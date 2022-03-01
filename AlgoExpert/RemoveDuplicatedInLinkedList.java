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

