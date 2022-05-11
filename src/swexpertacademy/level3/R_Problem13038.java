package swexpertacademy.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class R_Problem13038 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int TC = Integer.parseInt(br.readLine());

        for (int i = 1; i <= TC ; i++) {
            int n = Integer.parseInt(br.readLine()), count = 0;
            String input = br.readLine().replaceAll(" ","");
            StringBuffer s = new StringBuffer();
            s.append(0);
            for (int j = 0; j < input.length(); j++)
                if(input.charAt(j)-'0' == 1) {
                    count++;
                    s.append(j+1);
                }
            System.out.println(s);
            System.out.println(n/count*7);
            System.out.println(s.charAt(n%count)-'0');
            System.out.println(s.charAt(1)-'1');
            System.out.println();
            if(count == 1) sb.append("#"+i+" "+(7*n-6)+"\n");
            else sb.append("#"+i+" "+(n/count*7+s.charAt(n%count)-s.charAt(1)+1)+"\n");

        }
        System.out.print(sb);
    }
}
