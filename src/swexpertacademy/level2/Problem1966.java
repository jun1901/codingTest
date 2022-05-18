package swexpertacademy.level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Problem1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T ; i++) {
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] list = new int[n];
            for (int j = 0; j < n; j++) list[j]= Integer.parseInt(st.nextToken());
            Arrays.sort(list);
            sb.append("#"+i);
            for (int num: list) sb.append(" "+num);
            sb.append("\n");
        }
        /*
        for (int i = 1; i <= T ; i++) {
            br.readLine();
            StringTokenizer st = new StringTokenizer(br.readLine());
            ArrayList<Integer> list = new ArrayList<>();
            while (st.hasMoreTokens()) list.add(Integer.parseInt(st.nextToken()));
            Collections.sort(list);
            sb.append("#"+i);
            list.forEach(n -> sb.append(" "+n));
            sb.append("\n");
        }
        */
        System.out.print(sb);
    }
}
