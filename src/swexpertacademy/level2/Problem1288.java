package swexpertacademy.level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Problem1288 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        int[] equal  = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        String strNum = null;

        for (int i = 1; i <= cnt ; i++) {
            int result = 0;
            int[] output = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
            int num = Integer.parseInt(br.readLine());
            while (!Arrays.equals(output, equal)) {
                result++;
                strNum = (num * result) + "";
//                System.out.println("strNum = " + strNum);
                for (int j = 0; j < strNum.length(); j++) {
                    int find = strNum.charAt(j) - 48;
//                System.out.println(find);
                    if (output[find] == 0) output[find] = 1;
                }
//                System.out.println(Arrays.toString(output));
//                System.out.println("result = " + result);
            }
            System.out.printf("#%d %s\n", i, strNum);
        }

    }
}
