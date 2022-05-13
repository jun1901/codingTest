package swexpertacademy.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem12741 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken()),B = Integer.parseInt(st.nextToken()),
                C = Integer.parseInt(st.nextToken()),D = Integer.parseInt(st.nextToken());
            sb.append("#"+i+" ");
            if(C < A){
                if(B<D)sb.append(B-A);
                else if(D>A)sb.append(D-A);
                else sb.append(0);
            } else{
                if(D<B)sb.append(D-C);
                else if(B>C) sb.append(B-C);
                else sb.append(0);
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
