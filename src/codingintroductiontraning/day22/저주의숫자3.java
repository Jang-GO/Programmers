package codingintroductiontraning.day22;

public class 저주의숫자3 {
    public static void main(String[] args) {
        System.out.println(solution(15));
        System.out.println(solution(40));
    }
    private static int solution(int n){
        int sum=0;
        for(int i=0;i<n;i++){
            sum++;
            while(sum%3==0 || String.valueOf(sum).contains("3")){
                sum++;
            }
        }
        return sum;
    }
}
