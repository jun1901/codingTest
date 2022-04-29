package swexpertacademy.level1;

import java.io.*;
import java.util.*;

public class Problem2063 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> result = new ArrayList<>();
        int N = sc.nextInt();

        for(int i = 0; i < N; i++)
            result.add(sc.nextInt());
        Collections.sort(result);

        System.out.println(result.get(N/2));
        /*
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> result = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(br.readLine());

        while (st.hasMoreTokens())
            result.add(Integer.parseInt(st.nextToken()));
        Collections.sort(result);

        System.out.println(result.get(N/2));
*/
    }
}
