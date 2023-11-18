package codingintroductiontraning.day6;

import java.util.Arrays;

public class 짝수홀수개수 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4, 5})));
        System.out.println(Arrays.toString(solution(new int[]{1, 3, 5, 7})));
    }
    private static int[] solution(int[] num_list) {
        int[] answer = new int[2];
        int odd = 0;
        int even =0;
        for(int n:num_list){
            if(n%2==0){
                even++;
            }else{odd++;}
        }
        answer[0] = even;
        answer[1] = odd;
        return answer;
    }
}
