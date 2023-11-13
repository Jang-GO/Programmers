package codingbasictraining.day4;

public class 홀짝에따라다른값반환하기 {
    public static void main(String[] args) {
        홀짝에따라다른값반환하기 main = new 홀짝에따라다른값반환하기();
        System.out.println(main.solution(7));
        System.out.println(main.solution(10));
    }
    public int solution(int n){
        boolean isEven = n%2==0; // true면 짝수, false면 홀수
        int sum =0;
        if(isEven) {
            for (int i = 2; i <= n; i+=2) {
                sum+=Math.pow(i,2);
            }
        }else{
            for(int i=1; i<=n ; i+=2){
                sum+=i;
            }
        }
        return sum;
    }
}
