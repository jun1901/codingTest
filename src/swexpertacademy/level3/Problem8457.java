package swexpertacademy.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem8457 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken()), B = Integer.parseInt(st.nextToken()), E = Integer.parseInt(st.nextToken()),
                count = 0;
            st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()){
                int time = Integer.parseInt(st.nextToken());
                for (int j = B-E; j <= B+E; j++)
                    if(j % time == 0){
                        count++;
                        break;
                    }
            }
            sb.append("#"+i+" "+count+"\n");
        }
        System.out.print(sb);
    }
}
