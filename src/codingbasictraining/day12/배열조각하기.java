package codingbasictraining.day12;

import java.util.Arrays;

public class 배열조각하기 {
    public static void main(String[] args) {
        System.out.print(Arrays.toString(solution(new int[]{0,1,2,3,4,5}, new int[]{4,1,2})));
    }
    private static int[] solution(int[] arr, int[] query){
        int[] answer = Arrays.copyOf(arr,arr.length);
        for(int i=0;i<query.length;i++){
            if(i%2==0){
                answer = Arrays.copyOfRange(answer,0,query[i]+1);
                System.out.println(Arrays.toString(answer));

            }else{
                answer = Arrays.copyOfRange(answer,query[i],answer.length);
                System.out.println(Arrays.toString(answer));
            }
        }
        return answer;
    }
}
