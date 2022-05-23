package swexpertacademy.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class R_Problem6900 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken()),total=0;
            HashMap<String[], Long> map = new HashMap<>();
            for (int j = 0; j < n; j++) {
                st = new StringTokenizer(br.readLine());
                map.put(st.nextToken().split(""), Long.parseLong(st.nextToken()));
            }
            for (int j = 0; j < m; j++) {
                String input = br.readLine();
                for (int k = 0; k < n; k++) {
                    //map.
                }
            }


            sb.append("#"+i+" "+"   "+"\n");
        }
        System.out.print(sb);
    }
}
