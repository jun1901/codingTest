package swexpertacademy.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Problem8821 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int i = 1; i <= T ; i++) {
            ArrayList<String> result = new ArrayList<>();
            String input = br.readLine();
            for (int j = 0; j < input.length(); j++) {
                String s = input.substring(j, j + 1);
                if(!result.isEmpty() && result.contains(s)) result.remove(s);
                else result.add(s);
            }
            sb.append("#" + i + " " + result.size() + "\n");
        }

        System.out.println(sb);

    }
}
