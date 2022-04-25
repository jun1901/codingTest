package swexpertacademy.level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem1989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        for (int i = 1; i <= num ; i++) {
            String input = br.readLine();
            int result = 1;
            int length = input.length();
            for(int j = 0; j < length/2; j++){
                if(input.charAt(j) != input.charAt(length-j-1)){
                    result = 0;
                    break;
                }
            }
            System.out.printf("#%d %d\n", i, result);
        }
    }
}
