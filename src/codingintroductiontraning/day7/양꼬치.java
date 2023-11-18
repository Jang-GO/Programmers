package codingintroductiontraning.day7;

public class 양꼬치 {
    public static void main(String[] args) {
        System.out.println(solution(10,3));
    }
    private static int solution(int n,int k){
        return 12000*n + 2000*(k-n/10);
    }
}
