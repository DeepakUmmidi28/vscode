import java.util.Arrays;

public class Count {
    public char[] getCharacters(String str) {
        char ans[] = new char[0];
        // int counter=0;
        for (int i = 0; i < str.length(); i++) {
            Character c = str.charAt(i);
            if (Character.isDigit(c)) {
                // ans[counter++]=c;
                ans = Arrays.copyOf(ans, ans.length + 1);
                ans[ans.length - 1] = c;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String str = new String("abc123");
        Count c = new Count();
        char arr[] = c.getCharacters(str);
        // StringBuilder sb=new StringBuilder();
        // for (char X : arr) {
        // sb.append(X);
        // }
        // System.out.println(Integer.parseInt(sb.toString()));

        System.out.println(Integer.parseInt(String.valueOf(arr)));

    }
}
