package swexpertacademy.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Problem11856 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int TC = Integer.parseInt(br.readLine());

        for (int i = 1; i <= TC ; i++) {
            String S = br.readLine();
            S=S.replaceAll(S.substring(0,1),"");
            sb.append("#"+i+" ");
            if(S.length() != 2) sb.append("No\n");
            else{
                S=S.replaceAll(S.substring(0,1),"");
                if(S.length() == 0) sb.append("Yes\n");
                else sb.append("No\n");
            }
        }
        System.out.print(sb);
    }
}
