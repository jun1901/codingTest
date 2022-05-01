package swexpertacademy.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.StringTokenizer;

public class Problem8741 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T ; i++) {
            sb.append("#" + i + " ");
            StringTokenizer st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens())
                sb.append(st.nextToken().substring(0,1).toUpperCase());
            sb.append("\n");
        }
        System.out.println(sb);

    }
}
