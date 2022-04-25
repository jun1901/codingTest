package swexpertacademy.level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Problem1945 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] findNum = {2, 3, 5, 7, 11};

        for (int i = 1; i <= num ; i++) {
            int input = Integer.parseInt(br.readLine());
            int[] output = {0, 0, 0, 0, 0};
            int index = 0;
            while(input != 1){
                if(input % findNum[index] != 0) {
                    if(index < 4) index++;
                    else break;
                } else {
                    input /= findNum[index];
                    output[index]++;
                }
            }
            System.out.printf("#%d ", i);
            for (int out: output) {
                System.out.print(out + " ");
            }
            System.out.println();
        }
    }
}
