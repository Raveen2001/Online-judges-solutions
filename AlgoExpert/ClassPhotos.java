package AlgoExpert;

import java.util.*;

class Program {

  public boolean classPhotos(
      ArrayList<Integer> redShirtHeights, ArrayList<Integer> blueShirtHeights) {
    Collections.sort(redShirtHeights, Collections.reverseOrder());
		Collections.sort(blueShirtHeights, Collections.reverseOrder());
		if(redShirtHeights.get(0) < blueShirtHeights.get(0)){
			ArrayList<Integer> temp = blueShirtHeights;
			blueShirtHeights = redShirtHeights;
			redShirtHeights = temp;
		}
		
		System.out.println(redShirtHeights);
		System.out.println(blueShirtHeights);
		
		for(int i = 0; i<redShirtHeights.size(); i++){
			if(blueShirtHeights.get(i) >= redShirtHeights.get(i)) return false;
		}
		return true;
  }
}