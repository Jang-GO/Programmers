package codingintroductiontraning.day2;

public class 두수의나눗셈 {
    public static void main(String[] args) {
        int a1 = 3, b1 = 2, a2 = 7, b2 = 3;
        System.out.println(solution(a1,b1));
        System.out.println(solution(a2,b2));
    }
    public static int solution(int num1, int num2){
        return (int)(1000* ((double)num1 / num2));
    }
}
