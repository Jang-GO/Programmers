package codingintroductiontraning.day15;

public class 인덱스바꾸기 {
    public static void main(String[] args) {
        System.out.println(solution("hello",1,2));
        System.out.println(solution("i love you",3,6));
    }
    private static String solution(String my_string, int num1, int num2){
        char[] cha = my_string.toCharArray();
        char tmp;
        tmp = cha[num1];
        cha[num1] = cha[num2];
        cha[num2] = tmp;

        String answer = new String(cha);
        return answer;
    }
}
