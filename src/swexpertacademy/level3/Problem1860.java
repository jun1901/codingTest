package swexpertacademy.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem1860 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken()), K = Integer.parseInt(st.nextToken()),
                total = 0, index = 0, count = 0;
            boolean possible = true;
            int[] num = new int[N];
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) num[j] = Integer.parseInt(st.nextToken());
            Arrays.sort(num);
            for (int j = 0; j < N; j++) {
                if(num[j]/M*K <= j) {
                    possible = false;
                    break;
                }
            }
            /*
            while (count <= num[N-1]){
                if(count % M == 0 && count != 0) total += K;
                if(count++ == num[index]){
                    if(total > 0) total--;
                    else {
                        possible = false;
                        break;
                    }
                    index++;
                }
            }
            */
            sb.append("#"+i+" " + (possible? "Possible\n" : "Impossible\n"));
        }
        System.out.println(sb);
    }
}
