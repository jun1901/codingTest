package swexpertacademy.level1;

import java.util.Scanner;

public class Problem2070 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();

        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = a - b;
            if(n < 0) sb.append("#"+i+" <\n");
            else if(n > 0 ) sb.append("#"+i+" >\n");
            else sb.append("#"+i+" =\n");
        }

        System.out.println(sb);


    }
}
