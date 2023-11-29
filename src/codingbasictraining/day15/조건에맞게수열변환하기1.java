package codingbasictraining.day15;
import java.util.Arrays;

public class 조건에맞게수열변환하기1 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1,2,3,100,99,98})));
    }
    private static int[] solution(int[] arr){
        int[] answer = Arrays.copyOf(arr,arr.length);
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=50 && arr[i]%2==0){
                answer[i]/=2;
            }else if(arr[i]<=50 && arr[i]%2!=0){
                answer[i]*=2;
            }else continue;
        }
        return answer;
    }
}
