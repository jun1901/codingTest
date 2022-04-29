package swexpertacademy.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Problem7728 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        /*
        for (int i = 1; i <= T ; i++) {
            ArrayList<Character> result = new ArrayList<>();
            String X = br.readLine();
            for (int j = 0; j < X.length(); j++)
                if(!result.contains(X.charAt(j))) result.add(X.charAt(j));
            System.out.printf("#%d %d\n", i, result.size());
        }
        */
        for (int i = 1; i <= T ; i++) {
            Set<Integer> result = new HashSet<>();
            String X = br.readLine();
            for (int j = 0; j < X.length(); j++)
                result.add(X.charAt(j) - '0');
            System.out.printf("#%d %d\n", i, result.size());
        }

    }
}
