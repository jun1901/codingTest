package swexpertacademy.level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem2050 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        String input = br.readLine();
        for (int i = 0; i < input.length(); i++) {
             sb.append((input.charAt(i) - 64) + " ");
        }

        System.out.println(sb);

    }
}
