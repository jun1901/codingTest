package swexpertacademy.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem8338 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T ; i++) {
            int N = br.read()-'0', result = 0, num;
            br.readLine();
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                num = br.read()-'0';
                br.read();
                if(num <= 1 || result <= 1) result += num;
                else result *= num;
            }
            sb.append("#"+i+" "+result+"\n");
        }
        System.out.print(sb);
    }
}
