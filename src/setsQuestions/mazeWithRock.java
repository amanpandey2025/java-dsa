package setsQuestions;

public class mazeWithRock {
    public static void main(String[] args) {
        boolean[][] board ={
                {true,true,true},
                {true,false,true},
                {true,true,true}

        };
        rock("",board,0,0);

    }
    static void rock(String path,boolean[][] maze,int row , int column){
        if (maze[row][column] == false){
            return;
        }

        if (row == maze.length-1 && column == maze[0].length-1){
            System.out.println(path);
            return;
        }

        if (row< maze.length-1){
            rock(path+ 'D',maze,row+1,column);
        }
        if (column< maze[0].length-1){
            rock(path +'R',maze,row,column+1);
        }
    }
}
