package AlgoExpert;

import java.util.*;

class Program {
  public static int getNthFib(int n) {
    if(n == 0 || n == 1) return 0;
    return getNthFib(2, n, 0, 1);
  }
	
	public static int getNthFib(int cur, int n, int a, int b){
		if(cur == n){
			return b;
		}
		return getNthFib(++cur, n, b, b+a);
	}
}


// 2 method 
import java.util.*;

class Program {
  public static int getNthFib(int n) {
		if(n == 2) return 1;
		if(n == 1) return 0;
		return getNthFib(n-2) + getNthFib(n-1);
	}
}






//3 method --> optimal

import java.util.*;

class Program {
  public static int getNthFib(int n) {
		int[] lastTwo = {0, 1};
		int counter = 3;
		while(counter <=n){
			int nextFib = lastTwo[0] + lastTwo[1];
			lastTwo[0] = lastTwo[1];
			lastTwo[1] = nextFib;
			counter ++;
		}
		return (n>1)?lastTwo[1]: lastTwo[0];
	}
}