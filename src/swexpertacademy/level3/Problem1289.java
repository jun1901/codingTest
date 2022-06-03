package swexpertacademy.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem1289 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T ; i++) {
            String s = "0"+br.readLine();
            int count = 0;
            for (int j = 1; j < s.length(); j++) if(s.charAt(j-1)!=s.charAt(j)) count++;
            sb.append("#"+i+" "+count+"\n");
        }
        System.out.print(sb);
    }
}
