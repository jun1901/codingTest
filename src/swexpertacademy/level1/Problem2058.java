package swexpertacademy.level1;

import java.util.Scanner;

public class Problem2058 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] split = input.split("");
        int output = 0;
        for (String s: split ) {
            output += Integer.parseInt(s);
        }
        System.out.println(output);
    }
}
