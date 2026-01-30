package String;

public class stringIpAddr {

    public String IP(String address) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < address.length(); i++) {

            char ch = address.charAt(i);

            if (ch == '.') {
                sb.append("[.]");
            } else {
                sb.append(ch);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        stringIpAddr obj = new stringIpAddr();

        String result = obj.IP("1.1.1.1");

        System.out.println(result);
    }
}
