package swexpertacademy.level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem1948 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for (int i = 1; i <= num ; i++) {
            int result = 0, index = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] input = new int[st.countTokens()];
            while (st.hasMoreTokens())
                input[index++] = Integer.parseInt(st.nextToken());
            if(input[0] == input[2])
                result = input[3] - input[1] + 1;
            else{
                for (int j = input[0]; j < input[2]; j++) {
                    result += days[j-1];
                }
                result = result - input[1] + input[3] + 1;
            }
            System.out.printf("#%d %d\n", i , result);

        }

    }
}
