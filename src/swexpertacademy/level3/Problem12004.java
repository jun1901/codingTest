package swexpertacademy.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem12004 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int TC = Integer.parseInt(br.readLine()), N;
        for (int i = 1; i <= TC ; i++) {
            N = Integer.parseInt(br.readLine());
            boolean result = false;
            for (int j = 1; j <= 9; j++) {
                if(N % j == 0 && 1 <= N/j && N/j <= 9) {
                    result = true;
                    break;
                }
            }
            sb.append("#"+i+" "+(result?"Yes\n":"No\n"));
        }
        System.out.println(sb);
    }
}
