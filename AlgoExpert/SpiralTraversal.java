package AlgoExpert;

import java.util.*;

class Program {
  public static List<Integer> spiralTraverse(int[][] array) {
    int sr = 0;
		int sc = 0;
		int er = array.length - 1;
		int ec = array[0].length - 1;
		List<Integer> res = new ArrayList<>();
		System.out.println(sr + " " + sc + " " + er + " " + ec);
		while(sr < er && sc < ec){
			for(int i = sc; i<=ec; i++){
				res.add(array[sr][i]);
			}
			for(int i = sr + 1; i<=er; i++){
				res.add(array[i][ec]);
			}
			for(int i = ec - 1; i>= sc ; i--){
				res.add(array[er][i]);
			}
			
			for(int i = er - 1; i>= sr+1; i--){
				res.add(array[i][sr]);
			}
			sr ++;
			er --;
			sc ++;
			ec --;
		}
		if(sr == er && sc == ec){
			res.add(array[sr][er]);
		}else if(sr < er && sc == ec){
			for(int i = sr; i<=er; i++){
				res.add(array[i][ec]);
			}
		}else if(sc < ec && sr == er){
			for(int i = sc; i<=ec; i++){
				res.add(array[sr][i]);
			}
		}
    return res;
  }
}

