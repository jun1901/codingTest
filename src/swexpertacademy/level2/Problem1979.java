package swexpertacademy.level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem1979 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int num = Integer.parseInt(br.readLine());

        for (int i = 1; i <= num ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken()), K = Integer.parseInt(st.nextToken()),result = 0,count = 0;
            boolean[][] input = new boolean[N][N];
            System.out.printf("N=%d K=%d\n",N,K);
            for (int j = 0; j < N; j++) {
                st = new StringTokenizer(br.readLine());
                count = 0;
                for (int k = 0; k < N; k++) {
                    if(st.nextToken().equals("0")) {
                        if(count == K) result++;
                        input[j][k] = false;
                        count = 0;
                    }
                    else {
                        input[j][k] = true;
                        count++;
                    }
                }
                if(count == K) result++;
            }
            for (int j = 0; j < N; j++) {
                count = 0;
                for (int k = 0; k < N; k++) {
                    if(!input[k][j]) {
                        if(count == K) result++;
                        count = 0;
                    }
                    else count++;
                }
                if(count == K) result++;
            }
            sb.append("#"+i+" "+result+"\n");
        }
        System.out.println(sb);
    }
}
