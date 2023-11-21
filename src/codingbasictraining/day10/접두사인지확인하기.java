package codingbasictraining.day10;

public class 접두사인지확인하기 {
    public static void main(String[] args) {
        String my_string = "banana";
        System.out.println(solution(my_string,"ban"));
        System.out.println(solution(my_string,"nan"));
        System.out.println(solution(my_string,"abcd"));
        System.out.println(solution(my_string,"bananan"));
    }
    private static int solution(String my_string, String is_prefix){
        return (my_string.startsWith(is_prefix))?1:0;
    }
}
