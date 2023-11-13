package codingintroductiontraning.day3;

import java.util.Arrays;
import java.util.stream.IntStream;

public class 짝수는싫어요 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(10)));
        System.out.println(Arrays.toString(solution(15)));
    }
    public static int[] solution(int n){
        return IntStream.range(0,n+1).filter(i->i%2!=0).toArray();
    }
}
