package codingbasictraining.day23;

public class 주사위게임1 {
    public static void main(String[] args) {
        System.out.println(solution(3,5));
        System.out.println(solution(6,1));
        System.out.println(solution(2,4));
    }
    private static int solution(int a, int b) {
        int score = 0;
        if(a%2==1 && b%2==1){
            score+=(a*a + b*b);
        }else if(a%2==0 && b%2==0){
            score+=Math.abs(a-b);
        }else{
            score+=2*(a+b);
        }
        return score;
    }
}
