package swexpertacademy.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem10726 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());
            /*StringBuilder s = new StringBuilder(Integer.toBinaryString(M));
            sb.append("#"+i+" ");
            if(s.length()< N) sb.append("OFF\n");
            else sb.append(s.substring(s.length()-N).contains("0")?"OFF\n":"ON\n");*/
            String s = Integer.toBinaryString(M);
            sb.append("#"+i+" ");
            if(s.length()< N) sb.append("OFF\n");
            else sb.append(s.substring(s.length()-N).contains("0")?"OFF\n":"ON\n");
            /*else{
                s = s.substring(s.length()-N);
                sb.append(s.contains("0")?"OFF\n":"ON\n");
            }*/
        }
        System.out.print(sb);
    }
}
