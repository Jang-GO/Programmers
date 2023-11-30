package codingbasictraining.day16;

public class 특정한문자를대문자로바꾸기 {
    public static void main(String[] args) {
        System.out.println(solution("programmers","p"));
        System.out.println(solution("lowercase","x"));
    }
    private static String solution(String my_string, String alp){
        return my_string.replaceAll(alp,alp.toUpperCase());
    }
}
