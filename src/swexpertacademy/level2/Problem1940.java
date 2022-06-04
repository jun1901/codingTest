package swexpertacademy.level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem1940 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T ; i++) {
            int n = Integer.parseInt(br.readLine()), s = 0, result = 0;
            for (int j = 0; j < n; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                switch (st.nextToken()){
                    case "1" : result += s += Integer.parseInt(st.nextToken()); break;
                    case "2" : result += s = Math.max(0,s - Integer.parseInt(st.nextToken())); break;
                    default: result += s; break;
                }
            }
            sb.append("#"+i+" "+result+"\n");
        }
        System.out.print(sb);
    }
}
