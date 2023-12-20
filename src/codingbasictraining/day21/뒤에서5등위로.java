package codingbasictraining.day21;

import java.util.Arrays;

public class 뒤에서5등위로 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{12, 4, 15, 46, 38, 1, 14, 56, 32, 10})));
    }
    private static int[] solution(int[] num_list){
        Arrays.sort(num_list);
        int[] answer = new int[num_list.length-5];
        for(int i=0;i<answer.length;i++){
            answer[i] = num_list[i+5];
        }
        return answer;
    }
}
