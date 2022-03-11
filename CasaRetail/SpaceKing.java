package CasaRetail;

import java.util.ArrayList;
import java.util.List;

public class SpaceKing {
    private int maxGold;
    private final int p, q, n;
    private final List<List<Integer>> aliens;


    SpaceKing(int p, int q, int n, List<List<Integer>> aliens){
        this.p = p;
        this.q = q;
        this.n = n;
        this.aliens = aliens;
    }

    @Override
    public String toString() {
        return "SpaceAlien{" +
                "maxGold=" + maxGold +
                ", p=" + p +
                ", q=" + q +
                ", n=" + n +
                ", aliens=" + aliens +
                '}';
    }

    public void start(){
        shoot(aliens, 0, true);
        displayResult();
    }

    private void displayResult(){
        System.out.println(maxGold);
    }


    private void shoot(List<List<Integer>> aliens, int goldObtained, boolean isAshaTurn){
        if(aliens.isEmpty()){
            this.maxGold = Math.max(goldObtained, this.maxGold);
            return;
        }

        List<List<Integer>> temp = deepCopy2DList(aliens);



        if(isAshaTurn){
            for(int i = 0; i<aliens.size(); i++) {
                int tempGold = goldObtained;
                shoot(temp, goldObtained, false);
                temp = deepCopy2DList(aliens);
                int gold = hitOrKillAlienAndGetGold(temp, i, p);
                if(gold > 0){
                    tempGold += gold;
                }
                shoot(temp, tempGold, false);
            }
        }else{
            hitOrKillAlienAndGetGold(temp, 0, q);
            shoot(temp, goldObtained, true);
        }
    }

    private int hitOrKillAlienAndGetGold(List<List<Integer>> aliens, int alienIndex, int points){
        int hp = aliens.get(alienIndex).get(0);
        int gold = aliens.get(alienIndex).get(1);
        hp -= points;
        if(hp < 1) {
            aliens.remove(alienIndex);
            return gold;
        }
        aliens.get(alienIndex).set(0, hp);
        return 0;
    }

    private List<List<Integer>> deepCopy2DList(List<List<Integer>> aliens){
        List<List<Integer>> aliensCopy = new ArrayList<>();
        for(List<Integer> alien: aliens){
            aliensCopy.add(deepCopy1DList(alien));
        }
        return aliensCopy;
    }

    private List<Integer> deepCopy1DList(List<Integer> alien){
        List<Integer> alienCopy = new ArrayList<>();
        for(Integer a: alien){
            alienCopy.add(a);
        }
        return alienCopy;
    }
}
