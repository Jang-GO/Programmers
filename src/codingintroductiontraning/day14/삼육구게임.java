package codingintroductiontraning.day14;

public class 삼육구게임 {
    public static void main(String[] args) {
        System.out.println(solution(3));
        System.out.println(solution(29423));
    }
    private static int solution(int n){
        int cnt=0;
        while(n!=0){
            int tmp = n%10;
            if(tmp==3 || tmp==6|| tmp==9) cnt++;
            n/=10;
        }
        return cnt;
    }
}
