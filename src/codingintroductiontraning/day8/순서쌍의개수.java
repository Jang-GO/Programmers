package codingintroductiontraning.day8;

public class 순서쌍의개수 {
    public static void main(String[] args) {
        int n1 = 20, n2 = 100;
        System.out.println(solution(n1));
        System.out.println(solution(n2));
    }
    private static int solution(int n){
        int cnt=0;
        for(int i=1;i<=n;i++){
            if(n%i==0) cnt++;
        }
        return cnt;
    }
}
