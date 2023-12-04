package codingintroductiontraning.day20;

import java.util.Arrays;

public class 최댓값만들기_2 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, -3, 4, -5}));
        System.out.println(solution(new int[]{0, -31, 24, 10, 1, 9}));
        System.out.println(solution(new int[]{10, 20, 30, 5, 5, 20, 5}));
    }
    private static int solution(int[] numbers){
        Arrays.sort(numbers);
        return Math.max(numbers[0]*numbers[1],numbers[numbers.length-1]*numbers[numbers.length-2]);
    }
}
