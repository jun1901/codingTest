package swexpertacademy.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem6730 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int up, down, before, now, sub;

        for (int i = 1; i <= num ; i++) {
            up = down = 0;
            br.readLine();
            StringTokenizer st = new StringTokenizer(br.readLine());
            before = Integer.parseInt(st.nextToken());
            while (st.hasMoreTokens()){
                now = Integer.parseInt(st.nextToken());
                sub = now - before;
                if(before < now && up < sub) up = sub;
                else if(before > now && down < -sub) down = -sub;
                before = now;
            }
            System.out.printf("#%d %d %d\n", i, up, down);
        }
        /*
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int up, down, before, now, sub, cnt;

        for (int i = 1; i <= num ; i++) {
            up = down = 0;
            cnt = sc.nextInt();
            before = sc.nextInt();
            for(int j = 1; j < cnt; j++){
                now = sc.nextInt();
                sub = now - before;
                if(before < now && up < sub) up = sub;
                else if(before > now && down < -sub) down = -sub;
                before = now;
            }
            System.out.printf("#%d %d %d\n", i, up, down);
        }
        */

    }
}
