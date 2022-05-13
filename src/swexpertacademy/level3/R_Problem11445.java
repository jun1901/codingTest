package swexpertacademy.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class R_Problem11445 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T ; i++) {
            String p = br.readLine(), q = br.readLine();
            int l = Math.min(p.length(),q.length());
            boolean sw = true;
            for (int j = 0; j < l; j++) {
                if(p.charAt(j)>p.charAt(j)){
                    sw = false;
                    break;
                }
            }
            if(sw && p.length()<=q.length()) sw = false;
            sb.append("#"+i+" "+(sw?"Y":"N")+"\n");
        }
        System.out.print(sb);
    }
}
