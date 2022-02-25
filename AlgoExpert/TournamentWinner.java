package AlgoExpert;

import java.util.*;

class Program {

  public String tournamentWinner(
      ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
    // Write your code here.
		Map<String, Integer> pointsTable = new HashMap<>();
		String currentBestTeam = "";
		pointsTable.put(currentBestTeam, 0);
		for(int i = 0; i<results.size(); i++){
			String winningTeam = "";
			winningTeam = results.get(i) == 1 ? competitions.get(i).get(0) :competitions.get(i).get(1);
			updateWinningTeamScore(winningTeam, pointsTable);
			if(pointsTable.get(winningTeam) > pointsTable.get(currentBestTeam)){
				currentBestTeam = winningTeam;
			}
		}
    return currentBestTeam;
  }
	
	
	public void updateWinningTeamScore(String winningTeam, Map<String, Integer> pointsTable){
		if(pointsTable.containsKey(winningTeam)){
				pointsTable.put(winningTeam, pointsTable.get(winningTeam) + 3);
			}else{
				pointsTable.put(winningTeam, 3);
			}
	}
}
