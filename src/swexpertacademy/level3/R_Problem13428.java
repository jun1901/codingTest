package swexpertacademy.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class R_Problem13428 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int T = Integer.parseInt(br.readLine()),Mi,mi;

        for (int i = 1; i <= T ; i++) {
            String s = br.readLine();
            char max = s.charAt(0),min = s.charAt(0),c;
            Mi = mi = 0;
            for (int j = 1; j < s.length(); j++) {
                c = s.charAt(j);
                if(max < c){
                    max = c;
                    Mi = j;
                } else if( min > c) {
                    min = c;
                    mi = j;
                }
            }
            sb.append("#"+i+" ");
            sb.append(mi == 0 ? s : s.charAt(mi)+s.substring(1,mi)+s.charAt(0)+s.substring(mi+1));
            sb.append(" ");
            sb.append(Mi == 0 ? s : s.charAt(Mi)+s.substring(1,Mi)+s.charAt(0)+s.substring(Mi+1));
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
