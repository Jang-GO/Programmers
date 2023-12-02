package codingintroductiontraning.day18;

public class 세균증식 {
    public static void main(String[] args) {
        System.out.println(solution(2,10));
        System.out.println(solution(7,15));
    }
    private static int solution(int n, int t){
        for(int i=0;i<t;i++){
            n = n<<1;
        }
        return n;
    }
}
