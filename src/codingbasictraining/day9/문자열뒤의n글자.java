package codingbasictraining.day9;

public class 문자열뒤의n글자 {
    public static void main(String[] args) {
        String my_string = "ProgrammerS123", my_string1 = "He110W0r1d";
        int n = 11, n1 = 5;
        System.out.println(solution(my_string,n));
        System.out.println(solution(my_string1,n1));
    }
    private static String solution(String my_string, int n){
        return my_string.substring(my_string.length()-n);
    }
}
