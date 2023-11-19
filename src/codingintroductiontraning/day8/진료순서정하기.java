package codingintroductiontraning.day8;

import java.util.Arrays;

public class 진료순서정하기 {
    public static void main(String[] args) {
        int[] emergency1 = {3,76,24};
        int[] emergency2 = {1,2,3,4,5,6,7};
        int[] emergency3 = {30,10,23,6,100};

        System.out.println(Arrays.toString(solution(emergency1)));
        System.out.println(Arrays.toString(solution(emergency2)));
        System.out.println(Arrays.toString(solution(emergency3)));
    }

    private static int[] solution(int[] emergency){
        int[] answer = new int[emergency.length];
        for(int i=0;i<answer.length;i++){
            for(int j=0;j<answer.length;j++){
                if(emergency[i]<emergency[j]){
                    answer[i]++;
                }
            }
            answer[i]++;
        }
        return answer;
    }
}
