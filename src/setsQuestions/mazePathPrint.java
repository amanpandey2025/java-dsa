package setsQuestions;

public class mazePathPrint {
    public static void main(String[] args) {
        pathprint("",3,3);

    }
    static void pathprint(String processed,int row , int column){
        if (column==1&&row==1){
            System.out.println(processed);
        }
        if (row>1 && column>1){
            pathprint(processed+'T',row-1,column-1);
        }
        if (row>1){
            pathprint(processed+'D',row-1,column);
        }
        if (column>1){
            pathprint(processed+'R',row,column-1);
        }
    }
}
