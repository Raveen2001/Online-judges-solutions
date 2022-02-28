package SuperPACC.PhaseI;
import java.util.*;
public class MeatBalls {
    public static void main(String[] args) {
        int n, d;
        Scanner scanner = new Scanner(System.in);
        n = 4;
        d = 2;
        int meatBalls[] = new int[]{7, 8, 9, 3};
        int maxWeight = 0;
        int maxPointer = 0;
        for(int i = 0; i<n; i++){
            // meatBalls[i] = scanner.nextInt();
            System.out.println((meatBalls[i]+1)/d);
            System.out.println(maxWeight);
            System.out.println();
            if(((meatBalls[i]+1)/d) > maxWeight){
                maxWeight = (meatBalls[i]+1)/d;
                maxPointer = i+1;
            }
        }
        System.out.println(maxPointer);
    }
}
