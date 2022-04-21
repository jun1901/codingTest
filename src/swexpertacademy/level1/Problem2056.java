package swexpertacademy.level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem2056 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        for (int i = 1; i <= num ; i++) {
            StringBuffer sb = new StringBuffer(br.readLine());
            int month = Integer.parseInt(sb.substring(4, 6));
            int day = Integer.parseInt(sb.substring(6));
            int[] days = {0,31,28,31,30,31,30,31,31,30,31,30,31};
            if(month < 1 || month > 12 || days[month] < day || day < 1) System.out.printf("#%d -1\n", i);
            else {
                sb.insert(6,'/');
                sb.insert(4,'/');
                System.out.printf("#%d %s\n", i, sb);
            }

        }

    }
}
