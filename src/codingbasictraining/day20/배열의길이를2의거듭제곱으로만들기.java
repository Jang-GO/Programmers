package codingbasictraining.day20;

import java.util.Arrays;

public class 배열의길이를2의거듭제곱으로만들기 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4, 5, 6})));
        System.out.println(Arrays.toString(solution(new int[]{58, 172, 746, 89})));
    }
    private static int[] solution(int[] arr){
        int target=0;
        while(arr.length>Math.pow(2,target)){
            target++;
        }
        int size = (int)Math.pow(2,target);
        int[] answer = new int[size];
        for(int i=0;i<arr.length;i++){
            answer[i] = arr[i];
        }
        return answer;
    }
}
