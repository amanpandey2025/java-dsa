package setsQuestions;

import java.util.Arrays;

public class first {
    static void sets(String processed, String Unprocessed){
        if (Unprocessed.isEmpty()){
            System.out.print(Arrays.toString(processed.toCharArray()));
            return;
        }
        char ch =  Unprocessed.charAt(0);
        sets(processed +ch,Unprocessed.substring(1));
        sets(processed,Unprocessed.substring(1));
    }

    public static void main(String[] args) {
        sets("","abc");
    }
}
