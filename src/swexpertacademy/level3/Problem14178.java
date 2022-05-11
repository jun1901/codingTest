package swexpertacademy.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem14178 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
//            int N = Integer.parseInt(st.nextToken()), D = Integer.parseInt(st.nextToken());
//            sb.append("#"+i+" "+(int)Math.ceil(N/(2.0*D+1))+"\n");
            sb.append("#"+i+" "+(int)Math.ceil(Integer.parseInt(st.nextToken())/(2.0*Integer.parseInt(st.nextToken())+1))+"\n");

        }
        System.out.println(sb);
    }
}
