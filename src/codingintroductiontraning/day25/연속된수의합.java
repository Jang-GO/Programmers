package codingintroductiontraning.day25;

import java.util.Arrays;

public class 연속된수의합 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(3,12)));
        System.out.println(Arrays.toString(solution(5,15)));
        System.out.println(Arrays.toString(solution(4,14)));
        System.out.println(Arrays.toString(solution(5,5)));
    }
    private static int[] solution(int num, int total){
        int[] answer = new int[num];
        int start = (total/num) - ((num-1)/2);

        for(int i=0;i< num;i++){
            answer[i] = start;
            start ++;
        }
        return answer;
    }
}
