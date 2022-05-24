package swexpertacademy.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem9658 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T ; i++) {
            String input = br.readLine();
            double d = Math.round(Double.parseDouble(input.substring(0,3))/10);
            sb.append("#"+i+" ");
            if(d>=100) sb.append(d/100.0+"*10^"+(input.length())+"\n");
            else sb.append(d/10.0+"*10^"+(input.length()-1)+"\n");
        }
        System.out.print(sb);
    }
}
