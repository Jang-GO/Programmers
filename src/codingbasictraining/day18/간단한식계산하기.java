package codingbasictraining.day18;

public class 간단한식계산하기 {
    public static void main(String[] args) {
        System.out.println(solution("43 + 12"));
        System.out.println(solution("0 - 7777"));
        System.out.println(solution("40000 * 40000"	));
    }
    private static int solution(String binomial){
        String[] arr = binomial.split(" ");
        if(arr[1].equals("+")) return Integer.parseInt(arr[0]) + Integer.parseInt(arr[2]);
        if(arr[1].equals("-")) return Integer.parseInt(arr[0]) - Integer.parseInt(arr[2]);
        if(arr[1].equals("*")) return Integer.parseInt(arr[0]) * Integer.parseInt(arr[2]);
        return -1;
    }
}
