package codingintroductiontraning.day18;

public class 제곱수판별하기 {
    public static void main(String[] args) {
        System.out.println(solution(144));
        System.out.println(solution(976));
    }
    private static int solution(int n){
        if(n % Math.sqrt(n)==0) return 1;
        else return 2;
    }
}
