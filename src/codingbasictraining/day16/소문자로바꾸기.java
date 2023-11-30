package codingbasictraining.day16;

public class 소문자로바꾸기 {
    public static void main(String[] args) {
        System.out.println(solution("aBcDeFg"));
        System.out.println(solution("AAA"));
    }
    private static String solution(String myString){
        return myString.toLowerCase();
    }
}
