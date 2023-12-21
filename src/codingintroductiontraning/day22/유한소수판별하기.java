package codingintroductiontraning.day22;

import java.util.ArrayList;
import java.util.List;

public class 유한소수판별하기{
    public static void main(String[] args) {
        System.out.println(solution(7,20));
        System.out.println(solution(11,22));
        System.out.println(solution(12,21));
    }
    private static int solution(int a, int b){
        //최대공약수 구하기
        int t = 0;
        for(int i=1;i<b;i++){
            if(a%i==0 && b%i==0){
                t=i;
            }
        }
        b/=t;

        while(b!=1){
            if(b%2==0) b /=2;
            else if(b%5==0) b/=5;
            else return 2;
        }
        return 1;
    }
}
