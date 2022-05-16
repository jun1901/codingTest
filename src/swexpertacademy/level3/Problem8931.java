package swexpertacademy.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Problem8931 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int TR = Integer.parseInt(br.readLine());

        for (int i = 1; i <= TR ; i++) {
            int K = Integer.parseInt(br.readLine()), sum = 0, index = 0;
            int[] result = new int[K];
            for (int j = 0; j < K; j++) {
                result[index] = Integer.parseInt(br.readLine());
                if(result[index] == 0) {
                    sum -= result[--index];
                    result[index] = 0;
                }
                else {
                    sum += result[index];
                    index++;
                }
            }
            sb.append("#"+i+" "+sum+"\n");
            /*
            Stack<Integer> result = new Stack<>();
            int K = Integer.parseInt(br.readLine()), sum = 0;
            for (int j = 0; j < K; j++) {
                int num = Integer.parseInt(br.readLine());
                if(num == 0) result.pop();
                else result.push(num);
            }
//            for (int n: result) sum += n;
            while (!result.isEmpty()) sum += result.pop();
            sb.append("#"+i+" "+sum+"\n");
            */
        }
        System.out.print(sb);

    }
}
