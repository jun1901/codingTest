package swexpertacademy.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem7732 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T ; i++) {
            int[] t = new int[3];
            StringTokenizer st = new StringTokenizer(br.readLine(),":");
            for (int k = 0; k < 3; k++) t[k] -= Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine(),":");
            for (int k = 0; k < 3; k++) t[k] += Integer.parseInt(st.nextToken());
            if(t[2]<0){ t[2] += 60; t[1]--; }
            if(t[1]<0){ t[1] += 60; t[0]--; }
            if(t[0]<0) t[0] += 24;
            //System.out.printf("#%d %02d:%02d:%02d\n",i,t[0],t[1],t[2]);
            //sb.append(String.format("#%d %02d:%02d:%02d\n",i,t[0],t[1],t[2]));
            sb.append("#"+i+" "+(t[0]<10?"0":"")+t[0]+":"+(t[1]<10?"0":"")+t[1]+":"+(t[2]<10?"0":"")+t[2]+"\n");
        }
        System.out.print(sb);
    }
}
