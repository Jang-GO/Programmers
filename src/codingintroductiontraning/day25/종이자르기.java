package codingintroductiontraning.day25;

public class 종이자르기 {
    public static void main(String[] args) {
        System.out.println(solution(2,2));
        System.out.println(solution(2,5));
        System.out.println(solution(1,1));
    }
    private static int solution(int M, int N){
        return M*N-1;
    }
}
