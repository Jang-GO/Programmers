package codingbasictraining.day12;

import java.util.Arrays;

public class 숫자2의영역 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 1, 4, 5, 2, 9})));
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 1})));
        System.out.println(Arrays.toString(solution(new int[]{1, 1, 1})));
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 1, 2, 1, 10, 2, 1})));
    }
    private static int[] solution(int[] arr){
        int start = 0, end=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==2){
                start = i;
                break;
            }
        }
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==2){
                end = i;
                break;
            }
        }
        int[] answer = Arrays.copyOfRange(arr,start,end+1);
        if(answer[0]!=2 && answer[answer.length-1]!=2){
            return new int[]{-1};
        }
        return answer;
    }
}
