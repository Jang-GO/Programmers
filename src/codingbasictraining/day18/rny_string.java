package codingbasictraining.day18;

public class rny_string {
    public static void main(String[] args) {
        System.out.println(solution("masterpiece"));
        System.out.println(solution("programmers"));
        System.out.println(solution("jerry"));
        System.out.println(solution("burn"));
    }
    private static String solution(String rny_string){
        return rny_string.replaceAll("m","rn");
    }
}
