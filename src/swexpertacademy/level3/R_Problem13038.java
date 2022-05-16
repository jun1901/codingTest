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
            for (int j = 0; j < input.length(); j++)
                if(input.charAt(j)-'0' == 1) {
                    count++;
                    s.append(j+1);
                }

            s.insert(0,0);
            System.out.println(s);
            System.out.println(n/count*7);
            System.out.println(s.charAt(n%count)-'0');
            System.out.println(s.charAt(1)-'1');
            System.out.println();
            sb.append("#"+i+" ");
            if(count == 1) sb.append(7*n-6);
            else if(n <= count) sb.append(s.charAt(n)-s.charAt(1)+1);
            else sb.append(n/count*7+s.charAt(n%count)-s.charAt(1)+1);
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
