package swexpertacademy.level1;

import java.util.Scanner;
import java.util.Stack;

public class Problem2019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        /*
        Stack<Integer> output = new Stack<>();
        output.push(1);

        for (int i = 1; i <= num ; i++) {
            output.push(output.peek()*2);
        }

        output.forEach(i -> System.out.print(i + " "));
        */

        for (int i = 0; i <= num; i++) {
            System.out.print((int)Math.pow(2,i) + " ");
        }

    }
}
