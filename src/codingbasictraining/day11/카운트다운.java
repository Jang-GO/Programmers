package codingbasictraining.day11;

import java.util.Arrays;

public class 카운트다운 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(10,3)));
    }
    private static int[] solution(int start, int end_num){
        int[] answer = new int[start-end_num+1];
        for(int i=0;i<start-end_num+1;i++){
            answer[i] = start-i;
        }
        return answer;
    }
}
