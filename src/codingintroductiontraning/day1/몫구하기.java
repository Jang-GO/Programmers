package codingintroductiontraning.day1;

public class 몫구하기 {
    public static void main(String[] args) {
        int a1 = 10, b1 = 5, a2 = 7, b2 = 2;
        System.out.println(solution(a1,b1));
        System.out.println(solution(a2,b2));
    }
    public static int solution(int num1, int num2){
        return num1 / num2 ;
    }
}
