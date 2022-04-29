package swexpertacademy.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem9317 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int TC = Integer.parseInt(br.readLine());

        for (int i = 1; i <= TC ; i++) {
            int N = Integer.parseInt(br.readLine()), result = 0;
            String answer = br.readLine(), input = br.readLine();

            for (int j = 0; j < N; j++) {
                if(answer.charAt(j) == input.charAt(j)) result++;
            }

            System.out.printf("#%d %d\n", i, result);
        }

    }
}
