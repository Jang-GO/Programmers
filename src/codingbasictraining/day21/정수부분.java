package codingbasictraining.day21;

public class 정수부분 {
    public static void main(String[] args) {
        System.out.println(solution(1.42));
        System.out.println(solution(69.32));
    }
    private static int solution(double flo){
        return (int) flo;
    }
}
