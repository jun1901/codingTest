package swexpertacademy.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class R_Problem10570 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        boolean sw = true;

        for (int i = 1; i <= num ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken()),
                B = Integer.parseInt(st.nextToken()),
                result = 0;
            double min = Math.sqrt(A), max = Math.sqrt(B);
            min = min == (int) min ? min : (int) min + 1;

            System.out.println(min + ", " + max);

            for (int j = (int)min; j <= (int)max ; j++) {
                String strNum = j + "";
                System.out.println(strNum);
                sw = true;
                for (int k = 0; k < strNum.length() / 2; k++) {
                    if (strNum.charAt(k) != strNum.charAt(strNum.length() - k - 1)) {
                        sw = false;
                        break;
                    }
                }
                result = sw ? result +1 : result;
            }
            System.out.printf("#%d %d\n", i, result);

        }

    }
}
