package codingintroductiontraning.day11;

import java.util.Arrays;

public class 최댓값만들기1 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,2,3,4,5}));
        System.out.println(solution(new int[]{0,31,24,10,1,9}));
    }
    private static int solution(int[] numbers){
        Arrays.sort(numbers);
        return numbers[numbers.length-1] * numbers[numbers.length-2];
    }
}
