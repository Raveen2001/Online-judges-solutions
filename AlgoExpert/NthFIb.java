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

