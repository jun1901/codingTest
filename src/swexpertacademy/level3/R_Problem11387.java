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
//            long D = Long.parseLong(st.nextToken()),L = Long.parseLong(st.nextToken()), N = Long.parseLong(st.nextToken());
//            sb.append("#"+i+" "+((D * N) + ((D * L * N * (N - 1)) / 200))+"\n");
            int D = Integer.parseInt(st.nextToken()),L = Integer.parseInt(st.nextToken()), N = Integer.parseInt(st.nextToken());
            long result = D;
            for (int j = 1; j < N; j++) result += D*(1+j*L*0.01);
            sb.append("#"+i+" "+result+"\n");
        }
        System.out.print(sb);
    }
}
