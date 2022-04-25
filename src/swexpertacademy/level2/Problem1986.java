package swexpertacademy.level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem1986 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        boolean sw;

        for (int i = 1; i <= cnt ; i++) {
            sw = true;
            int num = Integer.parseInt(br.readLine());
            int result = 0;
            for (int j = 1; j <= num ; j++) {
                result += (sw ? j : -j);
                sw = !sw;
            }
            System.out.printf("#%d %d", i, result);

        }

    }
}
