package swexpertacademy.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.StringTokenizer;

public class R_Problem5515 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            Date d = new Date(2016, Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
            sb.append("#"+i+" "+(d.getDay()+ (d.getDay()<5?2:-5))+"\n");
        }
        System.out.print(sb);
    }
}
