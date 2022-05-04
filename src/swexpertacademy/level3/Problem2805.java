package swexpertacademy.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem2805 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T ; i++) {
            int N = Integer.parseInt(br.readLine()), mid = N/2, result=0;
            int[][] input = new int[N][N];
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N-1; k++) input[j][k] = br.read()-'0';
                input[j][N-1] = Integer.parseInt(br.readLine());
            }
            for (int j = 0; j <= mid; j++) {
                result += input[j][mid];
                for (int k = 1; k <= j; k++) result += input[j][mid+k] + input[j][mid-k];
            }
            for (int j = mid+1; j < N; j++) {
                result += input[j][mid];
                for (int k = 1; k <= N-j-1; k++) result += input[j][mid+k] + input[j][mid-k];
            }
            sb.append("#"+i+" "+result+"\n");
        }
        /*
        for (int i = 1; i <= T ; i++) {
            int N = Integer.parseInt(br.readLine()), mid = N/2, result=0;
            String[][] input = new String[N][];
            for (int j = 0; j < N; j++) input[j] = br.readLine().split("");
            for (int j = 0; j <= mid; j++) {
                result += Integer.parseInt(input[j][mid]);
                for (int k = 1; k <= j; k++) result += Integer.parseInt(input[j][mid+k]) + Integer.parseInt(input[j][mid-k]);
            }
            for (int j = mid+1; j < N; j++) {
                result += Integer.parseInt(input[j][mid]);
                for (int k = 1; k <= N-j-1; k++) result += Integer.parseInt(input[j][mid+k]) + Integer.parseInt(input[j][mid-k]);
            }
            sb.append("#"+i+" "+result+"\n");
        }
        */
        System.out.println(sb);
    }
}
