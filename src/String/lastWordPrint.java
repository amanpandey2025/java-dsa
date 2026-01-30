package String;

public class lastWordPrint {
    public static String lastWord(String s){

        int i =  s.length()-1;
        //end ki space skip
        while (i>=0 && s.charAt(i) == ' '){
            i--;
        }
        // what if there is no word
        if (i<0) return "";
        int end = i;
        //loop until space is found
        while (i>=0 && s.charAt(i)!= ' '){
            i--;
        }
        int start = i+1;
        return s.substring(start,end+1);

    }

    public static void main(String[] args) {
        String s = "   fly me   to   the moon   ";

        String ans = lastWord(s);

        System.out.println("Last word: " + ans);
    }
}
