package programmers.level2;

public class R_Solution5 { // 멀쩡한 사각형 - https://programmers.co.kr/learn/courses/30/lessons/62048?language=java
    public static void main(String[] args) {
        int w = 6, h = 12;
        System.out.println(solution(w,h));
    }

    public static long solution(int w, int h) {
        int temp = Math.max(w,h), com;
        w = Math.min(w,h);
        h = temp;
        long answer = w*h;
        System.out.printf("w : %d, h : %d, ans : %d\n",w,h,answer);
        if(w == h) answer -= w;
        else {
            for (int i = 2; i <= w; i++) {
                if(w % i == 0 && h % i == 0) {
                    answer -= i*w;
                    break;
                }
            }
        }

        return answer;
    }

}