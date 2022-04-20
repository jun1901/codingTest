package swexpertacademy.level1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class R_Problem2072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
        ArrayList<Stack<Integer>> list = new ArrayList<>();
        int[] output = new int[T];
		/*
		   여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
		*/
        for(int i = 0; i < T; i++){
            Stack<Integer> input = new Stack<>();
            for (int j = 0; j < 10; j++){
                input.push(sc.nextInt());
            }
            list.add(input);
        }

        for(int test_case = 1; test_case <= T; test_case++)
        {
            Stack<Integer> stack = list.get(test_case-1);
            while(!stack.isEmpty()) {
                int num = stack.pop();
                if (num % 2 == 1)
                    output[test_case-1] += num;
            }
            /////////////////////////////////////////////////////////////////////////////////////////////
			/*
				 이 부분에 여러분의 알고리즘 구현이 들어갑니다.
			 */
            /////////////////////////////////////////////////////////////////////////////////////////////

        }

    }
}
