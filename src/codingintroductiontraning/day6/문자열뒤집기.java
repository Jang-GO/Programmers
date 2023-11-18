package codingintroductiontraning.day6;

public class 문자열뒤집기 {
    public static void main(String[] args) {
        String my_string1 = "jaron";
        String my_string2 = "bread";

        System.out.println(solution(my_string1));
        System.out.println(solution(my_string2));
    }
    private static String solution(String my_string){
        char[] answer = my_string.toCharArray();
        int i=0, j=my_string.length()-1;
        while(i<j){
            char tmp = answer[i];
            answer[i] = answer[j];
            answer[j] = tmp;
            i++;
            j--;
        }
        return new String(answer);
    }
}
