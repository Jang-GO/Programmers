package codingbasictraining.day22;

public class 문자열로변환 {
    public static void main(String[] args) {
        System.out.println(solution(123));
        System.out.println(solution(2573));
    }
    private static String solution(int ss){
        // return String.valueOf(ss);
        return "" + ss;
    }
}
