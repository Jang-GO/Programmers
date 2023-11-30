package codingintroductiontraning.day16;

import java.util.Arrays;

public class 가장큰수찾기 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1,8,3})));
        System.out.println(Arrays.toString(solution(new int[]{9,10,11,8})));
    }
    private static int[] solution(int[] array){
        int[] answer = new int[2];
        int max = Arrays.stream(array).max().getAsInt();
        answer[0]=max;
        for(int i=0;i<array.length;i++){
            if(array[i]==max) answer[1]=i;
        }
        return answer;
    }
}
