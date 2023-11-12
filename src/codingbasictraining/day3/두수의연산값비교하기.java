package codingbasictraining.day3;

public class 두수의연산값비교하기 {
    public static void main(String[] args) {
        int a1 = 2, b1 = 91, a2 = 91, b2 = 2;
        System.out.println(solution(a1,b1));
        System.out.println(solution(a2,b2));
    }
    public static int solution(int a, int b) {
        int pint = Integer.parseInt(""+a+b);
        int other = 2*a*b;
        return Math.max(pint,other);
    }
}
