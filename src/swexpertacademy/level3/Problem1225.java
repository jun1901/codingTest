package swexpertacademy.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Problem1225 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= 10 ; i++) {
            br.readLine();
            Queue<Integer> q = new LinkedList<>();
            int n = 1, sub;
            StringTokenizer st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()) q.offer(Integer.parseInt(st.nextToken()));
            //q.forEach(j -> System.out.println(j));
            while ((sub = q.poll()-n++) > 0) {
                q.offer(sub);
                if(n>5) n=1;
            }
            q.offer(0);
            sb.append("#"+i+" ");
            q.forEach(j -> sb.append(j+" "));
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
