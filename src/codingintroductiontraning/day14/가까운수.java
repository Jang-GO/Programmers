package codingintroductiontraning.day14;

import java.util.Arrays;

public class 가까운수 {
    public static void main(String[] args){
        System.out.println(solution(new int[]{3,10,28},20));
        System.out.println(solution(new int[]{10,11,12},13));
    }
    private static int solution(int[] array, int n){
        Arrays.sort(array);
        int min = Integer.MAX_VALUE;
        int answer=0;
        for(int i=0;i<array.length;i++){
            int tmp = Math.abs(array[i]-n);
            if(tmp<min){
                min = tmp;
                answer = array[i];
            }
        }
        return answer;

    }
}
