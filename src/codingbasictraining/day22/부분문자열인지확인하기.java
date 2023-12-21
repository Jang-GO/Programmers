package codingbasictraining.day22;

public class 부분문자열인지확인하기 {
    public static void main(String[] args) {
        System.out.println(solution("banana","ana"));
        System.out.println(solution("banana","wxyz"));
    }
    private static int solution(String my_string, String target){
        return my_string.contains(target) ? 1 : 0;
    }
}
