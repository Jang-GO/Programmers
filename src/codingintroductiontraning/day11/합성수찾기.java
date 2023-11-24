package codingintroductiontraning.day11;

public class 합성수찾기 {
    public static void main(String[] args) {
        System.out.println(solution(10));
        System.out.println(solution(15));
    }
    private static int solution(int n){
        int answer = 0;
        int cnt=0;
        for(int i=3;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i%j==0){
                    cnt++;
                    if(cnt==3){
                        answer++;
                        cnt=0;
                        break;
                    }
                }
            }
        }
        return answer;
    }
}
