package codingintroductiontraning.day13;

import java.util.Arrays;

public class 삼각형의완성조건1 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,2,3}));
        System.out.println(solution(new int[]{3,6,2}));
        System.out.println(solution(new int[]{199,72,222}));
    }
    private static int solution(int[] sides){
        Arrays.sort(sides);
        return (sides[2]>=sides[1]+sides[0]) ? 2 : 1;
    }
}
