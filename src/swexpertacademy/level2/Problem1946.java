package swexpertacademy.level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem1946 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T ; i++) {
            int n = Integer.parseInt(br.readLine()), count=1;
            sb.append("#"+i+"\n");
            for (int j = 0; j < n; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                char s = st.nextToken().charAt(0);
                //String s = st.nextToken();
                int l = Integer.parseInt(st.nextToken());
                for (int k = 0; k < l; k++, count++) {
                    sb.append(s +(count %10 == 0?"\n":""));
                    //if(count % 10 == 0) sb.append("\n");
                }
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
