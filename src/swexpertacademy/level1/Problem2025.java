package swexpertacademy.level1;

import java.util.Scanner;

public class Problem2025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int result = (1+num)*(num/2);

        /*for (int i = 1; i <= num; i++) {
            result += i;
        }*/

        System.out.println(result);

    }
}
