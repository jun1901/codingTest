package swexpertacademy.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Problem4676 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer(), s;
        int T = Integer.parseInt(br.readLine()),h;

        for (int i = 1; i <= T; i++) {
            s = new StringBuffer(br.readLine());
            h = Integer.parseInt(br.readLine());
            int[] count = new int[s.length()+1];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < h; j++) count[Integer.parseInt(st.nextToken())]++;
            for (int j = s.length(); j >= 0; j--) while(count[j]-->0) s.insert(j,'-');
            sb.append("#"+i+" "+s+"\n");
        }
        /*
        for (int i = 1; i <= T ; i++) {
            s = new StringBuffer(br.readLine());
            h = Integer.parseInt(br.readLine());
            Integer[] list = new Integer[h];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < h; j++) list[j] = Integer.parseInt(st.nextToken());
            Arrays.sort(list, Collections.reverseOrder());
            for (int j: list) s.insert(j,'-');
            sb.append("#"+i+" "+s+"\n");
        }
        */
        System.out.print(sb);
    }
}
