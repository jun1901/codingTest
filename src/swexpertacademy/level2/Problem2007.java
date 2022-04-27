package swexpertacademy.level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem2007 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        for (int i = 1; i <= num ; i++) {
            String input = br.readLine();
            String find = input.charAt(0)+"";
            while (input.indexOf(find, 1) != (find.length() - 1)) {
                find = input.substring(0,find.length()+1);
            }

            System.out.printf("#%d %d\n", i, find.length() - 1);
        }

    }
}
