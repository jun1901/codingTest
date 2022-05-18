package swexpertacademy.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem8840 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T ; i++) {
            int L = Integer.parseInt(br.readLine()), result=L/2;
            //for (int j = 1; j < L/2; j++) result += 2*j;
            //sb.append("#"+i+" "+result+"\n");
            sb.append("#"+i+" "+result*result+"\n");
        }
        System.out.print(sb);
    }
}
