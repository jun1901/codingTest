package swexpertacademy.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem9997 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T ; i++) {
            int h = 0, m = 0, deg = Integer.parseInt(br.readLine());
            System.out.printf("#%d %d %d\n", i, deg / 30, deg % 30 * 2);
        }

    }
}
