package codingbasictraining.day5;

public class 주사위게임2 {
    public static void main(String[] args) {
        int a1=2, b1=6, c1=1;
        int a2=5, b2=3, c2=3;
        int a3=4, b3=4, c3=4;
        System.out.println(solution(a1,b1,c1));
        System.out.println(solution(a2,b2,c2));
        System.out.println(solution(a3,b3,c3));
    }
    public static int solution(int a, int b, int c) {
        if(a!=b && b!=c && a!=c){
            return a+b+c;
        }
        else if(a==b && b==c){ // Math.pow는 double형 반환 ..
            return (a+b+c) * (a*a+b*b+c*c) * (a*a*a + b*b*b + c*c*c);
        }
        else{
            return (a+b+c) * (a*a+b*b+c*c);
        }
    }
}
