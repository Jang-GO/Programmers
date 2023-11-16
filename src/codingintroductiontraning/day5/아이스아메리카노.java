package codingintroductiontraning.day5;

import java.util.Arrays;

public class 아이스아메리카노 {
    private static final int iceA = 5500;
    public static void main(String[] args) {
        int money1 = 5_500;
        int money2 = 15_000;
        System.out.println(Arrays.toString(solution(money1)));
        System.out.println(Arrays.toString(solution(money2)));
    }

    private static int[] solution(int money) {
        int[] answer = new int[2];
        answer[0] = money/iceA;
        answer[1] = money%iceA;
        return answer;
    }
}
