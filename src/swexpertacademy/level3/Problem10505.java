package swexpertacademy.level3;

import java.io.*;
import java.util.*;

public class Problem10505 {
    public static void main(String[] args) throws IOException {
        /*
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 1; i <= T; i++) {
            int N = sc.nextInt(), result = 0;
            double avg = 0;
            Stack<Integer> input = new Stack<>();
            for (int j = 0; j < N; j++) {
                input.push(sc.nextInt());
                avg += input.peek();
            }
            avg /= N;
            while (!input.isEmpty()) if(input.pop() <= avg) result++;

            System.out.printf("#%d %d\n", i, result);
        }
        */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T ; i++) {
            int N = Integer.parseInt(br.readLine()), result = 0;
            double avg = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            Stack<Integer> input = new Stack<>();
            while (st.hasMoreTokens()){
                input.push(Integer.parseInt(st.nextToken()));
                avg += input.peek();
            }
            avg /= N;
            while (!input.isEmpty()) if(input.pop() <= avg) result++;

            System.out.printf("#%d %d\n", i, result);
        }
    }
}
