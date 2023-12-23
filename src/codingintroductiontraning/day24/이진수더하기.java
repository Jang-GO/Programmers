package codingintroductiontraning.day24;

public class 이진수더하기 {
    public static void main(String[] args) {
        System.out.println(solution("10","11"));
        System.out.println(solution("1001","1111"));
    }
    private static String solution(String bin1,String bin2){
        int sum = Integer.parseInt(bin1,2) + Integer.parseInt(bin2,2);
        return Integer.toBinaryString(sum);
    }
}
