package swexpertacademy.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Problem3456 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T ; i++) {
            ArrayList<String> result = new ArrayList<>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()){
                String input = st.nextToken();
                if(!result.isEmpty() && result.contains(input)) result.remove(input);
                else result.add(input);
            }
            sb.append("#"+i+" "+result.get(0)+"\n");
        }
        System.out.println(sb);

    }
}
