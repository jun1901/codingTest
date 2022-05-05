package swexpertacademy.level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Problem2005 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T; i++) {
            int N = Integer.parseInt(br.readLine());
            int[][] result = new int[N][N];
            sb.append("#"+i+"\n");
            for (int j = 0; j < N ; j++) {
                for (int k = 0; k <= j; k++) {
                    if(k == 0 || j == k) result[j][k] = 1;
                    else result[j][k] = result[j-1][k-1] + result[j-1][k];
                    sb.append(result[j][k] + " ");
                }
                sb.append("\n");
            }
        }

        /*
        for (int i = 1; i <= T; i++) {
            int N = Integer.parseInt(br.readLine());
            ArrayList<Integer>[] result = new ArrayList[N];

            for (int j = 0; j < N ; j++) {
                ArrayList<Integer> nums = new ArrayList<>();
                nums.add(1);
                for (int k = 0; k < j - 1; k++) {
                    nums.add(result[j-1].get(k) + result[j-1].get(k+1));
                }
                if(j != 0) nums.add(1);
                result[j] = nums;
            }
            sb.append("#"+i+"\n");
            for (int j = 0; j < N; j++) {
                result[j].forEach(n -> sb.append(n+" "));
                sb.append("\n");
            }
        }
        */
        System.out.println(sb);
    }
}
