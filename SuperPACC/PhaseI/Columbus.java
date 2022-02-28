package SuperPACC.PhaseI;

import java.util.*;

public class Columbus {
    static int ways = 0;
    public static void main(String[] args) {
        int n = 7;
        int m = 6;
        int x = 2;
        int y = 2;
        int grid[][] = new int[n][m];
        grid[n-1][m-1] = 1;
        grid[x-1][y-1] = -1;
       findPaths(grid, n, m, 0, 0);
       System.out.println(ways);
    }

    public static void findPaths(int[][] grid, int n, int m, int x, int y){
        System.out.println(x+" "+y + " =>" + (x>=0 && y>=0 && x<n && y<m));
        if(x>=0 && y>=0 && x<n && y<m){
            System.out.println("=> " + grid[x][y]);
            if(grid[x][y] == -1 || grid[x][y]==10) return;
            if(grid[x][y] == 1){
                ways ++;
            }
            else {
                grid[x][y] = 10;
                findPaths(Arrays.copyOf(grid, grid.length), n, m, x+1, y);
                findPaths(Arrays.copyOf(grid, grid.length), n, m, x-1, y);
                findPaths(Arrays.copyOf(grid, grid.length), n, m, x, y+1);
                findPaths(Arrays.copyOf(grid, grid.length), n, m, x, y-1);
            }
        }
        System.out.println("returning");
        
    }
}
