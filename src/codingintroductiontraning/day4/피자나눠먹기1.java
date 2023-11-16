package codingintroductiontraning.day4;

public class 피자나눠먹기1 {
    public static void main(String[] args) {
        int n1 =7, n2=1, n3=15;
        System.out.println(solution(n1));
        System.out.println(solution(n2));
        System.out.println(solution(n3));
    }
    private static int solution(int n){
        return n%7==0 ? n/7: n/7+1;
    }
}
