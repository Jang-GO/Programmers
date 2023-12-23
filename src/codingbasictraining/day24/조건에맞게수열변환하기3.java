package codingbasictraining.day24;

import java.util.Arrays;

public class 조건에맞게수열변환하기3 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1,2,3,100,99,98},3)));
        System.out.println(Arrays.toString(solution(new int[]{1,2,3,100,99,98},2)));
    }
    private static int[] solution(int[] arr, int k){
        int[] answer = Arrays.copyOfRange(arr,0,arr.length);
        if(k%2==0){
            for(int i=0;i<answer.length;i++){
                answer[i]+=k;
            }
        }else {
            for(int i=0;i<answer.length;i++){
                answer[i]*=k;
            }
        }
        return answer;
    }
}
