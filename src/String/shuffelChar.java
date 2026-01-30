package String;

public class shuffelChar {
    public String solution(String s,int[] indices){
        char[] result = new char[s.length()];
        for (int i = 0; i <s.length() ; i++) {
            result[indices[i]] = s.charAt(i);
        }
        return new String(result);
    }

    public static void main(String[] args) {
        shuffelChar shuffelChar = new shuffelChar();

        String s =  "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        String result =  shuffelChar.solution(s,indices);
        System.out.println(result);
    }
}
