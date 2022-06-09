package programmers.level1;

public class Solution10 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(solution(nums));
    }

    public static int solution(int[] nums) {
        int answer = 0, sum;

        for (int i = 0; i < nums.length-2; i++) {
            for (int j = i+1; j < nums.length-1; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    boolean sw = true;
                    sum = nums[i]+nums[j]+nums[k];
                    System.out.println(sum);
                    for (int l = 2; l < Math.sqrt(sum)+1; l++) {
                        if(sum % l == 0){
                            sw = false;
                            break;
                        }
                    }
                    if(sw) answer++;
                }
            }
        }
        System.out.println("\n");

        return answer;
    }


}
