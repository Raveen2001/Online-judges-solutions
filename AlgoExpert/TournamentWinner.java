package AlgoExpert;

import java.util.*;

class Program {

  public String tournamentWinner(
      ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
    // Write your code here.
		Map<String, Integer> pointsTable = new HashMap<>();
		String winningTeam = "";
		for(int i = 0; i<results.size(); i++){
			if(results.get(i) == 0){
				winningTeam = competitions.get(i).get(1);
			}else{
				winningTeam = competitions.get(i).get(0);
			}
			if(pointsTable.containsKey(winningTeam)){
				pointsTable.put(winningTeam, pointsTable.get(winningTeam) + 3);
			}else{
				pointsTable.put(winningTeam, 3);
			}
		}
		int maxPoints = 0;
		for(Map.Entry<String, Integer> entry: pointsTable.entrySet()){
			System.out.println(entry.getKey() + " : " + entry.getValue());
			if(entry.getValue() > maxPoints){
				winningTeam = entry.getKey();
				maxPoints = entry.getValue();
			} 
		}
    return winningTeam;
  }
}
