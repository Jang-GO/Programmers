package codingintroductiontraning.day15;

public class 영어가싫어요 {
    static String[] arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    public static void main(String[] args) {
        System.out.println(solution("onetwothreefourfivesixseveneightnine"));
        System.out.println(solution("onefourzerosixseven"));
    }
    private static long solution(String numbers){
        for(int i=0;i<numbers.length();i++){
            numbers = numbers.replaceAll(arr[i],String.valueOf(i));
        }
        return Long.parseLong(numbers);
    }
}
