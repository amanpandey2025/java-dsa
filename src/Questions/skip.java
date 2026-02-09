package Questions;

public class skip {
    public static void main(String[] args) {

        String s = "aaarubyaaa";
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <s.length() ; i++) {
            char ch = s.charAt(i);

            if (ch!= 'a'){
                result.append(ch);
            }

        }
        System.out.println(result.toString());
    }
}
