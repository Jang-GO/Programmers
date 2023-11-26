package codingintroductiontraning.day12;

public class 모음제거 {
    public static void main(String[] args) {
        System.out.println(solution("bus"));
        System.out.println(solution("nice to meet you"));
    }
    private static String solution(String my_string){
        String answer="";
        answer = my_string.replaceAll("[aeiou]]","");
        return answer;
    }
}
