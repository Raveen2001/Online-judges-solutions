package SuperPACC.PhaseI;
import java.util.*;


public class StackOp {
    public static void main(String[] args) {
        SortedSet<Integer> set = new TreeSet<>();
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int t, a;
        for(int i = 0; i<n; i++){
            t = scanner.nextInt();
            if(t == 1){
                a = scanner.nextInt();
                stack.push(a);
                set.add(a);
            }else if(t == 2){
                a = stack.pop();
                set.remove(a);
            }else{
                System.out.println(set.toArray()[0]);
            }
        }
    }
}
