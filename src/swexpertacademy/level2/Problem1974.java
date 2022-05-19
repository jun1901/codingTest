package swexpertacademy.level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Problem1974 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int T = Integer.parseInt(br.readLine()), sum;
        for (int i = 1; i <= T ; i++) {
            int[][] bingo = new int[9][9];
            int[] sums = new int[9];
            boolean sw = true;
            System.out.println("#"+i);
            for (int j = 0; j < 9; j++) {
                sum = 0;
                for (int k = 0; k < 9; k++) {
                    sum += bingo[j][k] = (br.read()-'0');
                    sums[k] += bingo[j][k];
                    br.read();
                    System.out.print(bingo[j][k]+" ");
                }
                System.out.println();
                if(sw && sum != 45) sw = false;
            }
            System.out.println("1 "+sw);
            if(sw){
                for (int j = 0; j < 9; j++) if(!(sw = (sums[j] == 45))) break;
                System.out.println("2 "+sw);
                if(sw){
                    Arrays.fill(sums,0);
                    for (int j = 0; j < 9; j++) {
                        for (int k = 0; k < 9; k++) {
                            sums[j/3*3+k/3] += bingo[j][k];
                        }
                    }
                    for (int j = 0; j < 9; j++) System.out.println("sum"+j+" "+sums[j]);
                    for (int j = 0; j < 9; j++) if(!(sw = (sums[j] == 45))) break;
                    //System.out.println("3 "+sw);
                }
            }
            System.out.println("\n");
            sb.append("#"+i+" "+(sw?1:0)+"\n");
        }
        System.out.print(sb);
    }
}
