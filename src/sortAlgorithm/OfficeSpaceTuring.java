package sortAlgorithm;

public class OfficeSpaceTuring {

    int numberOfOffices(String [][] grid){
        int result = 0;
        boolean[][] visited = new boolean[grid.length][grid[0].length];
//    for(int i = 0 ; i < grid.length; i++){
//        visited[i] = [];
//    }
        for(int x=0; x<grid.length; x++){
            for(int y =0; y < grid[x].length; y++){
                boolean v=visited[x][y];
                int g =Integer.parseInt(grid[x][y]);
                if(!v && g == 1){
                    result++;
                    markvisited(grid,x,y,visited);
                }
                visited[x][y] = true;
            }
        }
        return result;
    }

    void markvisited(String [][] grid, int x , int y , boolean[][] visited){
        if(x < 0 || x > grid.length - 1 || y < 0 || y > grid[x].length -1){
                return;
        }
        boolean v=visited[x][y];
        int g =Integer.parseInt(grid[x][y]);
        if(v == true){
            return;
        }
        visited[x][y] = true;

        if(g == 0){
            return;
        }
        markvisited(grid, x-1, y, visited);
        markvisited(grid, x+1, y, visited);
        markvisited(grid, x, y-1, visited);
        markvisited(grid, x, y+1, visited);
    }
    public static void main(String[] args) {

//        int [][] grid = {{1,0,1,1,1},{1,0,1,1,1},{1,1,1,1,1},{1,0,0,1,0}};
        String  [][] grid = {{"1","1","0","0","0"},{"1","1","0","0","0"},{"0","0","1","0","0"},{"0","0","0","1","1"}};
//        int [][] grid = {{1,1,1,1,1},{1,0,0,0,1},{1,1,0,0,0},{0,0,0,1,1}};
//        int [][] grid = {{1,1,1,1,0},{1,1,0,1,0},{1,1,0,0,0},{0,0,0,0,0}};

        OfficeSpaceTuring office = new OfficeSpaceTuring();
        int result = office.numberOfOffices(grid);

        System.out.println("Number of offices: "+result);
    }
}
