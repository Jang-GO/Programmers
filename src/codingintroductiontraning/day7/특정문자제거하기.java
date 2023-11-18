package codingintroductiontraning.day7;

public class 특정문자제거하기 {
    public static void main(String[] args) {
        System.out.println(solution("BCBdbe","B"));
    }
    private static String solution(String my_string, String letter){
        String answer = my_string.replaceAll(letter,"");
        return answer;
    }
}
