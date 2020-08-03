
/**
 * 岛屿问题
 * Created by Qin on 2020/4/20.
 */
public class IsLands {
    public static void main(String[] args) {
        IsLands isLands = new IsLands();
        char[][] chars = {{'1', '1', '1', '1', '0'}, {'1', '1', '0', '1', '0'}, {'1', '1', '0', '0', '0'}, {'0', '0', '0', '0', '0'}};

        System.out.println(isLands.numIslands(chars));
    }

    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        int m = grid.length;
        int n = grid[0].length;

        int res = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    res++;
                    dfs(i, j, grid);
                }
            }
        }

        return res;
    }

    public void dfs(int i, int j, char[][] grid) {
        //递归结束条件
        if (i < 0 || j < 0 || i > grid.length - 1 || j > grid[0].length - 1) {
            return;
        }

        if (grid[i][j] == '1') {
            grid[i][j] = '2';
            dfs(i - 1, j, grid);
            dfs(i, j - 1, grid);
            dfs(i, j + 1, grid);
            dfs(i + 1, j, grid);
        }
    }

}
