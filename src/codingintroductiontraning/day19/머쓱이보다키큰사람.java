package codingintroductiontraning.day19;

import java.util.Arrays;

public class 머쓱이보다키큰사람 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{149, 180, 192, 170},167));
        System.out.println(solution(new int[]{180,120,140},190));
    }
    private static int solution(int[] array, int height){
        int count = 0;
        for(int i=0;i<array.length;i++){
            if(array[i]>height){
                count++;
            }
        }
        return count;
    }
}
