package codingbasictraining.day3;

public class 문자열곱하기 {
    public static void main(String[] args) {
        문자열곱하기 main = new 문자열곱하기();
        String my_string1 = "string";
        int k1 = 3;
        String my_string2 = "love";
        int k2 = 10;

        System.out.println(main.solution(my_string1,k1));
        System.out.println(main.solution(my_string2,k2));
    }
    public String solution(String my_string, int k){
        return my_string.repeat(k);
    }
}
