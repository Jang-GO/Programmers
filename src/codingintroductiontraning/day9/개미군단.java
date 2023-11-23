package codingintroductiontraning.day9;

import org.w3c.dom.ls.LSOutput;

public class 개미군단 {
    public static void main(String[] args) {
        System.out.println(solution(23));
        System.out.println(solution(24));
        System.out.println(solution(999));
    }
    private static int solution(int hp){
        int cnt=0;
        cnt+=hp/5;
        hp%=5;
        cnt+=hp/3;
        hp%=3;
        cnt+=hp/1;
        return cnt;
    }
}
