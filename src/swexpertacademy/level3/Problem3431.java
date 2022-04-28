package swexpertacademy.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem3431 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        for (int i = 1; i <= num ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int L = Integer.parseInt(st.nextToken()),
                U = Integer.parseInt(st.nextToken()),
                X = Integer.parseInt(st.nextToken());
            int result = 0;

            if(X < L) result = L - X;
            else if(X > U) result = -1;

            System.out.printf("#%d %d\n", i, result);
        }

    }
}
