package greedy.백준;

import java.util.Arrays;

public class test {

    public static void main(String[] args) {
        String s = "80875542";

        char[] ch = s.toCharArray();
        Arrays.sort(ch);

        for (int i = 0; i < ch.length; i++) {
            System.out.println(ch[i]);
        }
    }
}
