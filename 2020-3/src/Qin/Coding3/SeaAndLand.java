package Qin.Coding3;

/**
 * Created by Qin on 2020/3/29.
 */
public class SeaAndLand {
    public static void main(String[] args) {
        SeaAndLand seaAndLand = new SeaAndLand();
        int[][] q = {{1, 0, 1}, {0, 0, 0}, {1, 0, 1}};
        seaAndLand.maxDistance(q);
        System.out.println(seaAndLand.maxDistance(q));
    }

    public int maxDistance(int[][] grid) {
        int a = 0;
        for (int[] x : grid) {
            for (int y : x) {
                a = a + y;
            }
        }
        if (a == 0 || a == grid.length * grid.length) {
            return -1;
        } else {
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid.length; j++) {

                    for (int l = 0; l < grid.length; l++) {
                        for (int k = 0; k < grid.length; k++) {
                        if(grid[i][j]==1&&grid[l][k]==0){
                             a=Math.max(a,Math.abs(i-l)+Math.abs(j-k));
                        }

                        }
                    }
                }
            }
        }
        return a;
    }
}
