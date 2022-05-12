package swexpertacademy.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class R_Problem11387 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int D = Integer.parseInt(st.nextToken()), L = Integer.parseInt(st.nextToken()), N = Integer.parseInt(st.nextToken());
            sb.append("#"+i+" "+(D*(N+((N-1)*N*L/2*0.01)))+"\n");
        }
        System.out.print(sb);
    }
}
