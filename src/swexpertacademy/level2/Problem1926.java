package swexpertacademy.level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem1926 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        for (int i = 1; i <= num ; i++) {
            String result = (i + "").replaceAll("[369]", "-");
            if(result.contains("-")) result = result.replaceAll("[^-]","");
            System.out.print(result + " ");
        }

    }
}
