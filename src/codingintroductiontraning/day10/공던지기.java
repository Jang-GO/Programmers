package codingintroductiontraning.day10;

public class 공던지기 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,2,3,4},2));
        System.out.println(solution(new int[]{1,2,3,4,5,6},5));
        System.out.println(solution(new int[]{1,2,3},3));
    }
    private static int solution(int[] numbers, int k){
        return numbers[(k-1)*2%numbers.length];
    }
}
