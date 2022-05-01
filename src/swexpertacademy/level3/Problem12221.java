package swexpertacademy.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem12221 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int TC = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();

        for (int i = 1; i <= TC ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken()),
                B = Integer.parseInt(st.nextToken());
            sb.append("#").append(i).append(" ").append((A < 10 && B < 10) ? A * B : -1).append("\n");
        }
        System.out.println(sb);

    }
}
