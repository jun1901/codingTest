package swexpertacademy.level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Problem1983 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int T = Integer.parseInt(br.readLine());
        String[] s = {"A+","A0","A-","B+","B0","B-","C+","C0","C-","D0"};


        for (int i = 1; i <= T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken())-1, count = 0;
            /*
            Double[] sums = new Double[n];
            for (int j = 0; j < n; j++) {
                st = new StringTokenizer(br.readLine());
                sums[j] = Integer.parseInt(st.nextToken()) * 0.35
                        + Integer.parseInt(st.nextToken()) * 0.45
                        + Integer.parseInt(st.nextToken()) * 0.2;
            }
            double f = sums[k];
            Arrays.sort(sums, Collections.reverseOrder());
            for (int j = 0; j < n; j++) if(sums[j] == f) count = j;
*/
            double[] sums = new double[n];
            for (int j = 0; j < n; j++) {
                st = new StringTokenizer(br.readLine());
                sums[j] = Integer.parseInt(st.nextToken()) * 0.35
                        + Integer.parseInt(st.nextToken()) * 0.45
                        + Integer.parseInt(st.nextToken()) * 0.2;
                if(j>k && sums[j]>sums[k]) count++;
            }
            System.out.println(Arrays.toString(sums));
            for (int j = 0; j < k; j++) if(sums[j]>sums[k]) count++;
            sb.append("#"+i+" "+s[count*10/n]+"\n");

            /*
            sb.append("#"+i+" ");
            switch (count*10/n){
                case 0: sb.append("A+\n"); break;
                case 1: sb.append("A0\n"); break;
                case 2: sb.append("A-\n"); break;
                case 3: sb.append("B+\n"); break;
                case 4: sb.append("B0\n"); break;
                case 5: sb.append("B-\n"); break;
                case 6: sb.append("C+\n"); break;
                case 7: sb.append("C0\n"); break;
                case 8: sb.append("C-\n"); break;
                default: sb.append("D0\n"); break;
            }*/
        }
        System.out.print(sb);
    }
}
