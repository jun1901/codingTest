package swexpertacademy.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem8016 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T ; i++) {
            long N = Long.parseLong(br.readLine());
            sb.append("#"+i+" "+(1+2*Math.pow(N-1,2))+" "+(2*Math.pow(N,2)-1)+"\n");
            //sb.append("#"+i+" "+(1+2*(N-1)*(N-1))+" "+(2*N*N-1)+"\n");
        }
        System.out.print(sb);
    }
}
