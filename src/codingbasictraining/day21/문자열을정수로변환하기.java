package codingbasictraining.day21;

public class 문자열을정수로변환하기 {
    public static void main(String[] args) {
        System.out.println(solution("10"));
        System.out.println(solution("8542"));
    }
    private static int solution(String n_str){
        return Integer.parseInt(n_str);
    }
}
