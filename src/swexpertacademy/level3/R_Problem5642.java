package swexpertacademy.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class R_Problem5642 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int T = Integer.parseInt(br.readLine()), n, max, index = -1;

        for (int i = 1; i <= T ; i++) {
            n = Integer.parseInt(br.readLine());
            int[] nums = new int[n], sums = new int[2];
            max = 0;
            boolean sw = true;

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                nums[j] = Integer.parseInt(st.nextToken());
                if(sw){
                    //if(nums[j]>0)
                }
            }
            /*
            while (st.hasMoreTokens()){
                num = Integer.parseInt(st.nextToken());
                *//*if(num > 0 || sum > -num) sum += num;
                else {
                    max = Math.max(max,sum);
                    sum = 0;
                }*//*
            }
            */
            sb.append("#"+i+" "+max+"\n");
        }
        System.out.print(sb);
    }
}
