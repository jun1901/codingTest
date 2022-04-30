package swexpertacademy.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Problem1234 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        for (int i = 1; i <= 2 ; i++) {
            Stack<Integer> result = new Stack<>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            int len = Integer.parseInt(st.nextToken());
            String num = st.nextToken();
            for (int j = 0; j < len; j++) {
                int n = num.charAt(j) - '0';
                if(!result.isEmpty() && result.peek() == n) result.pop();
                else result.push(n);
            }
            sb.append("#").append(i).append(" ");
            result.forEach(sb::append);
            sb.append("\n");
        }
        System.out.println(sb);

    }
}
