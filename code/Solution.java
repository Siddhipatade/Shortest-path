import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public static void main(String[] args) {
        int[][] grid = {
            {0, 0, 0},
            {1, 1, 0},
            {1, 1, 0}
        };
        
        Solution solution = new Solution();
        int shortestPath = solution.shortestPathBinaryMatrix(grid);
        System.out.println("Shortest Path Length: " + shortestPath);
    }

    public int shortestPathBinaryMatrix(int[][] grid) {
        if (grid[0][0] == 1) {
            return -1;
        }

        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0, 0, 1});
        grid[0][0] = 1;

        while (!q.isEmpty()) {
            int[] cur = q.remove();
            int i = cur[0];
            int j = cur[1];
            int ans = cur[2];

            if (j == grid[0].length - 1 && i == grid.length - 1) {
                return ans;
            }

            for (int x = -1; x <= 1; x++) {
                for (int y = -1; y <= 1; y++) {
                    if (i + x < 0 || j + y < 0 || i + x >= grid.length || j + y >= grid[0].length) {
                        continue;
                    }

                    if (grid[i + x][j + y] == 0) {
                        q.add(new int[]{i + x, j + y, ans + 1});
                        grid[i + x][j + y] = 1;
                    }
                }
            }
        }

        return -1;
    }
}
