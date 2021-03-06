package sortAlgorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AreaOfRecTableTuring {
    List<Integer> oneCounts = new ArrayList<>();
    List<Integer> innerCount = new ArrayList<>();
    int oneCount = 0;
    boolean previous = false;
    int loopCount = 0;
    int totalLoop =0;
    public static int biggestTable(String[][] grid) {
        AreaOfRecTableTuring area =new AreaOfRecTableTuring();
        int result = 0;
        boolean[][] visited = new boolean[grid.length][grid[0].length];
//    for(int i = 0 ; i < grid.length; i++){
//        visited[i] = [];
//    }
        for (int x = 0; x < grid.length; x++) {
            for (int y = 0; y < grid[x].length; y++) {
                boolean v = visited[x][y];
                int g = Integer.parseInt(grid[x][y]);
                if (!v && g == 1) {
                    result++;
                    area.checked(grid, x, y, visited);
                area.innerCount.add(area.oneCount);
                }
                visited[x][y] = true;
                if(area.innerCount.size()>0){
                    Collections.sort(area.innerCount);
                    area.oneCounts.add(area.innerCount.get(area.innerCount.size()-1));
                    area.innerCount.clear();
                }area.oneCount = 0;
                area.previous = false;
            }
        }
        Collections.sort(area.oneCounts);
        return area.oneCounts.get(area.oneCounts.size()-1);
    }

    void checked(String[][] grid, int x, int y, boolean[][] visited) {
        int length = grid.length;
        if (x < 0 || x > length - 1 || y < 0 || y > grid[x].length - 1) {
            return;
        }
        int length1 = grid[x].length;
        boolean firstRow = x == 0;
        boolean lastRow = x + 1 > length - 1;
        int up = firstRow ? 0 : Integer.parseInt(grid[x - 1][y]);
        int down = lastRow ? 0 : Integer.parseInt(grid[x + 1][y]);
        int left = y == 0 ? 0 : Integer.parseInt(grid[x][y - 1]);
        int right = y + 1 > length1 - 1 ? 0 : Integer.parseInt(grid[x][y + 1]);
        boolean v = visited[x][y];
        int g = Integer.parseInt(grid[x][y]);
        if (v == true) {
            return;
        }
        visited[x][y] = true; totalLoop++;

        if (g == 0) {
//            if (grid[x][]==0)
            return;
        }
        if (g == 1 && ((up == 1 && right == 1) || (right == 1 && down == 1) || (down == 1 && left == 1) || (left == 1 && up == 1))) {
//            if (previous || loopCount ==0) {
            oneCount++;
            previous = true;
            loopCount = 0;

//            }else nt =0;
        } else if (previous) {
            loopCount++;
            if (loopCount > 1) {
                oneCount--;
                loopCount = 0;
                previous = false;
            }
            if ((firstRow && left == 1 && right == 1 && down == 0) || (lastRow && left == 1 && right == 1 && up == 0) || (!firstRow && !lastRow && left == 1 && right == 1 && up == 0)) {
                innerCount.add(oneCount);
                oneCount =0;
            }
        }
        checked(grid, x - 1, y, visited);
        checked(grid, x + 1, y, visited);
        checked(grid, x, y - 1, visited);
        checked(grid, x, y + 1, visited);
    }

    public static void main(String[] args) {

//        int[][] grid = {
//                {1, 0, 1, 1, 1},
//                {1, 0, 1, 1, 1},
//                {1, 1, 1, 1, 1},
//                {1, 0, 0, 1, 0}};
       String [][] grid = {
                {"1","1","0","0","0"},
                {"1","1","0","0","0"},
                {"0","0","1","0","0"},
                {"0","0","0","1","1"}};
        /*int [][] grid = {
                {1,1,1,1,1},
                {1,0,0,0,1},
                {1,1,0,0,0},
                {0,0,0,1,1}};*/

//        int[][] grid = {
//                {1, 1, 1, 1, 0},
//                {1, 1, 0, 1, 0},
//                {1, 1, 0, 0, 0},
//                {0, 0, 0, 0, 0}};
//        int[][] grid = {
//                {1, 1, 1, 1, 1},
//                {1, 1, 0, 1, 1},
//                {1, 1, 0, 1, 1},
//                {0, 0, 0, 1, 1}};
//        int [][] grid = {
//                {0,0,0,1,1},
//                {1,1,0,1,1},
//                {1,1,0,1,1},
//                {1,1,1,1,1}};
//        int [][] grid = {
//                {1,0,1,1,1},
//                {1,0,1,1,1},
//                {1,1,1,1,1},
//                {1,0,0,1,0}};
//        int [][] grid = {
//                {1,0,1,0,0},
//                {1,0,1,1,1},
//                {1,1,1,1,1},
//                {1,0,0,1,0}};

        AreaOfRecTableTuring office = new AreaOfRecTableTuring();
        int result = AreaOfRecTableTuring.biggestTable(grid);

//        System.out.println("Number of offices: " + result);
        System.out.print("Area of rectangular table "+result);
    }
}
