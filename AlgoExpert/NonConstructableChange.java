package AlgoExpert;
import java.util.*;

class Program {

  public int nonConstructibleChange(int[] coins) {
    Arrays.sort(coins);
		int c = 0;
		for(int i = 0; i<coins.length; i++){
			if(coins[i] > c + 1){
				return c+1;
			}else{
				c+= coins[i];
			}
		}
    return c+1;
  }
}

