package codingintroductiontraning.day4;

public class 피자나눠먹기2 {
    public static void main(String[] args) {
        int n1=6, n2=10, n3=4;
        System.out.println(solution(n1));
        System.out.println(solution(n2));
        System.out.println(solution(n3));
    }
    private static int solution(int n){
        return n*6/getPizzaGCD(n,6)/6;
    }
    public static int getPizzaGCD(int humanCount,int num){
        if(num==0) return humanCount;
        return getPizzaGCD(num,humanCount%num);
    }
}
