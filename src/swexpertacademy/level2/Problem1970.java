package swexpertacademy.level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem1970 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] money = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
        int[] result = null;
        int num = Integer.parseInt(br.readLine());

        for (int i = 1; i <= num ; i++) {
            result = new int[money.length];
            int index = 0;
            int input = Integer.parseInt(br.readLine());
            while (input != 0 && index < money.length){
                result[index] = input/money[index];
                input %= money[index++];
            }
            System.out.println("#" + i);
            for (int cnt: result) {
                System.out.printf("%d ", cnt);
            }
            System.out.println();
        }

    }
}
