package codingbasictraining.day23;

import java.util.Arrays;

public class 정수찾기 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 4, 5},3));
        System.out.println(solution(new int[]{15,98,23,2,15},20));
    }
    private static int solution(int[] num_list, int n){
        return Arrays.stream(num_list).anyMatch(x-> x==n) ? 1 : 0;
    }
}
