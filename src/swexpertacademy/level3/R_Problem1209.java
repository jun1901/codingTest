package swexpertacademy.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class R_Problem1209 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int num=1,sum,sum1,index=0;
        ArrayList<Integer> sums = new ArrayList<>();
        while ((num = Integer.parseInt(br.readLine())) <= 1) {
            int[][] input = new int[100][100];
            for (int j = 0; j < 100; j++) {
                System.out.println(j);
                StringTokenizer st = new StringTokenizer(br.readLine());
                sum = 0;
                for (int k = 0; k < 100; k++) sum += input[j][k] = Integer.parseInt(st.nextToken());
                sums.add(sum);
            }
            for (int j = 0; j < 100; j++) {
                sum = 0;
                for (int k = 0; k < 100; k++) sum += input[k][j];
                sums.add(sum);
            }
            sum = sum1 = 0;
            while (index < 100){
                sum += input[index][index];
                sum1 += input[index][99-index];
            }
            sums.add(sum);
            sums.add(sum1);
            Collections.sort(sums,Collections.reverseOrder());
            sb.append("#"+num+" "+sums.get(0)+"\n");
        }
        System.out.println(sb);

    }
}
