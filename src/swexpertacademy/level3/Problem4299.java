package swexpertacademy.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem4299 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int d = Integer.parseInt(st.nextToken()), h = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken()), result = -1;
            if(d > 11 || h > 11 || (h == 11 && m >= 11)) result = (d-11)*24*60+(h-11)*60+(m-11);
            sb.append("#"+i+" "+result+"\n");
        }
        /*
        int t1 = 11*24*60+11*60+11, t2;
        for (int i = 1; i <= T ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            t2 = Integer.parseInt(st.nextToken()) * 24 * 60 + Integer.parseInt(st.nextToken()) * 60 + Integer.parseInt(st.nextToken());
            sb.append("#"+i+" "+(t2>=t1?t2-t1:-1)+"\n");
        }
        */
        System.out.print(sb);
    }
}
