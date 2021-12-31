package SuperPACC.PhaseI;

import java.util.Arrays;
import java.util.Scanner;

class Main{
    static char[] saba = new char[]{'s', 'a', 'b', 'a'};
    public static boolean checkHorizontal(char[][] maze, int si, int sj){
        for(int i = 1; i<=3; i++){
            if(maze[si][sj + i] != saba[i]){
                return false;
            }
        }
        return true;
    }

    public static boolean checkVertical(char[][] maze, int si, int sj){
        for(int i = 1; i<=3; i++){
            if(maze[si+i][sj] != saba[i]){
                return false;
            }
        }
        return true;
    }

    public static boolean checkMainDiagonal(char[][] maze, int si, int sj){
        for(int i = 1; i<=3; i++){
            if(maze[si+i][sj + i] != saba[i]){
                return false;
            }
        }
        return true;
    }

    public static boolean checkCrossDiagonal(char[][] maze, int si, int sj){
        for(int i = 1; i<=3; i++){
            if(maze[si - i][sj + i] != saba[i]){
                // System.out.println("false" + maze[si-i][sj - i]+ (si -i) + " " + (sj - i));
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        char[][] maze = new char[m][n];
        // maze[0] = new char[]{'s', 'a', 'f', 'e', 'r'};
        // maze[1] = new char[]{'a','m', 'j', 'a', 'd'};
        // maze[2] = new char[]{'b', 'a', 'b', 'o', 'l'};
        // maze[3] = new char[]{'a', 'a', 'r', 'o', 'n'};
        // maze[4] = new char[]{'s', 'o', 'n', 'g', 's'};
        int i, j;
        scanner.nextLine();
        for(i = 0; i<m; i++){
            System.out.print(i);
            maze[i] = scanner.nextLine().toCharArray();
            System.out.println(maze[i]);
        }


        int count = 0;


        for(i = 0; i<m - 3; i++){
            for(j = 0; j<n - 3; j++){
                if(maze[i][j] == saba[0]){
                    count += checkHorizontal(maze, i, j)? 1: 0;
                    count += checkVertical(maze, i, j)?1:0;
                    count += checkMainDiagonal(maze, i, j)?1:0;
                }
            }
        }

        for(i = m-1; i>=3; i--){
            for(j = 0; j<n-3; j++){
                if(maze[i][j] == saba[0]){
                    // System.out.println(i + "hello" + j);
                    count += checkCrossDiagonal(maze, i, j)?1:0;
                }
            }
        }

        System.out.println(count);
    }
}