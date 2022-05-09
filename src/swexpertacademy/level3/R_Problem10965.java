package swexpertacademy.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class R_Problem10965 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T ; i++) {
            int A = Integer.parseInt(br.readLine()), B = 1;
            while (Math.sqrt(A*B) != (int)Math.sqrt(A*B)) B++;
            sb.append("#"+i+" "+B+"\n");
        }
        System.out.println(sb);

    }
}
