package codingbasictraining.day3;

public class 문자리스트를문자열로변환하기 {
    public static void main(String[] args) {
        String[] arr = {"a","b","c"};
        System.out.println(solution(arr));
    }
    public static String solution(String[] arr){
        StringBuilder answer= new StringBuilder();
        for(String s : arr){
            answer.append(s);
        }
        return answer.toString();
    }
}
