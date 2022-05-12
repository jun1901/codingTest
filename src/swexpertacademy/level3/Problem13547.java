package swexpertacademy.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem13547 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T ; i++) {
            int count = 0;
            String result = br.readLine();
            for (int j = 0; j < result.length(); j++) if(result.substring(j,j+1).equals("x")) count++;
            /*
            String[] result = br.readLine().split("");
            for (String s: result) if(s.equals("x")) count++;
            */
            sb.append("#"+i+" "+ (count <= 7 ? "YES\n" : "NO\n"));
        }
        System.out.println(sb);

    }
}
