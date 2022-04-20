package swexpertacademy.level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Problem1545 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> output = new Stack<>();

        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i <= num; i++) {
            output.push(i);
        }

        while (!output.isEmpty()) System.out.print(output.pop() + " ");

    }
}
