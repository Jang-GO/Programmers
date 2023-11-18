package codingbasictraining.day8;

public class 주사위게임3 {
    public static void main(String[] args) {
        int a1=2, b1=2, c1=2, d1=2;
        int a2=4, b2=1, c2=4, d2=4;
        int a3=6, b3=3, c3=3, d3=6;
        int a4=2, b4=5, c4=2, d4=6;
        int a5=6, b5=4, c5=2, d5=5;

        System.out.println(solution(a1,b1,c1,d1));
        System.out.println(solution(a2,b2,c2,d2));
        System.out.println(solution(a3,b3,c3,d3));
        System.out.println(solution(a4,b4,c4,d4));
        System.out.println(solution(a5,b5,c5,d5));
    }

    private static int solution(int a, int b, int c, int d) {
        int answer = 0;
        if(a == b && b == c && c == d) {
            answer = 1111 * a;
        }else if(a == b && b == c) {
            answer = (int) Math.pow((10*a+d),2);
        }else if(a == d && d == c) {
            answer = (int) Math.pow((10*a+b),2);
        }else if(b == d && d == c) {
            answer = (int) Math.pow((10*d+a),2);
        }else if(a == d && d == b) {
            answer = (int) Math.pow((10*a+c),2);
        }else if(a == b && c == d) {
            answer = (a + c) * Math.abs(a -c);
        }else if(a == c && b == d) {
            answer = (a + b) * Math.abs(a -b);
        }else if(a == d && c == b) {
            answer = (a + c) * Math.abs(a -c);
        }else if( a == b && a != c && a != d && c!=d) {
            answer = c*d;
        }else if( a == c && a != b && a != d && b!=d) {
            answer = b*d;
        }else if( a == d && a != b && a != c && b!=c) {
            answer = b*c;
        }else if( b == c && b != a && b != d && a!=d) {
            answer = a*d;
        }else if( b == d && b != a && b != c && a!=c) {
            answer = a*c;
        }else if( c == d && c != b && c != a && a!=b) {
            answer = a*b;
        }else{
            int min = 6;
            if(min >= a) min = a;
            if(min >= b) min = b;
            if(min >= c) min = c;
            if(min >= d) min = d;
            answer = min;
        }
        return answer;
    }
}
