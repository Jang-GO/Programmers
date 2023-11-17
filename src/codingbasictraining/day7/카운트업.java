package codingbasictraining.day7;

import java.util.Arrays;

public class 카운트업 {
    public static void main(String[] args) {
        int start_num = 3;
        int end_num = 10;
        System.out.println(Arrays.toString(solution(start_num,end_num)));
    }
    private static int[] solution(int start_num, int end_num){
        int[] answer = new int[end_num-start_num+1];
        int tmp = start_num;
        for(int i=0;i<answer.length;i++){
            answer[i] = tmp++;
        }
        return answer;
    }
}
