package String;

import java.util.Arrays;

public class countLastWord {
    public int lastwordCount(String s){
        int length= 0;
        int end =  s.length()-1;
        while (end>=0 && s.charAt(end) == ' '){
            end--;
        } //last ke spaces skip kr deye
        while (end>=0 && s.charAt(end)!= ' '){
            length++;
            end--;
        } //uske bad word count jb tak space nhi aa jata
        return length;
    }

    public static void main(String[] args) {
        countLastWord clw =  new countLastWord();
        String s = "my name us aman pandey";
        int ans = clw.lastwordCount(s);
        System.out.println(ans);
    }
}
