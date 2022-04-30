package swexpertacademy.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem3314 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int sum, T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            sum = 0;
            while (st.hasMoreTokens()){
                int num = Integer.parseInt(st.nextToken());
                sum += Math.max(num, 40);
            }
            sb.append("#").append(i).append(" ").append(sum / 5).append("\n");
//            sb.append(String.format("#%d %d\n",i,sum/5));
        }
        System.out.println(sb);
    }
}
