package swexpertacademy.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class R_Problem1217 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 1; i <= 2 ; i++) {
            br.readLine();
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken()),
                y = Integer.parseInt(st.nextToken()),
            result = pow(x, x, y);
            System.out.printf("#%d %d", i, result);
        }

    }

    private static int pow(int result, int x, int y) {
        result *= x;
        return y != 2 ? pow(result, x, y - 1) : result;
    }
}
