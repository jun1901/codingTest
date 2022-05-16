package swexpertacademy.level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Problem1959 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int sum,max=0,k;
            int[] nm = {Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())};
            ArrayList<Integer>[] input = new ArrayList[2];
            for (int j = 0; j < 2; j++) {
                st = new StringTokenizer(br.readLine());
                ArrayList<Integer> in = new ArrayList<>();
                while (st.hasMoreTokens()) in.add(Integer.parseInt(st.nextToken()));
                input[j] = in;
            }
            for (int j = 0; j <= Math.abs(input[0].size() - input[1].size()); j++) {
                sum = 0;
                if(input[0].size()<input[1].size()){
                    for (k = 0; k < input[0].size(); k++) sum += input[0].get(k)*input[1].get(k+j);
                    //System.out.println(max + " " + sum);
                    max = Math.max(max, sum);
                } else{
                    for (k = 0; k < input[1].size(); k++) sum += input[0].get(k+j)*input[1].get(k);
                    //System.out.println(max + " " + sum);
                    max = Math.max(max, sum);
                }
            }
            sb.append("#"+i+" "+max+"\n");
        }
        System.out.print(sb);
    }
}
