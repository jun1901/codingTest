package swexpertacademy.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem10059 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T ; i++) {
            int num = Integer.parseInt(br.readLine()),b = num/100,a= num%100;
            sb.append("#"+i+" ");
            if(0 < b && b < 13)
                if(0 < a && a < 13) sb.append("AMBIGUOUS\n");
                else sb.append("MMYY\n");
            else
                if(0 < a && a < 13) sb.append("YYMM\n");
                else sb.append("NA\n");
            /*
            if(1 <= b && b <= 12 && 1 <= a && a <= 12) sb.append("AMBIGUOUS\n");
            else if(1 <= a && a <= 12) sb.append("YYMM\n");
            else if(1 <= b && b <= 12) sb.append("MMYY\n");
            else  sb.append("NA\n");
            */
            /*
            String input = br.readLine();
            int b = Integer.parseInt(input.substring(0, 2)), a = Integer.parseInt(input.substring(2, 4));
            sb.append("#"+i+" ");
            if(1 <= b && b <= 12 && 1 <= a && a <= 12) sb.append("AMBIGUOUS\n");
            else if(1 <= b && b <= 12) sb.append("MMYY\n");
            else if(1 <= a && a <= 12) sb.append("YYMM\n");
            else  sb.append("NA\n");
            */
        }
        System.out.println(sb);

    }
}
