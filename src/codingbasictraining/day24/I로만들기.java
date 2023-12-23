package codingbasictraining.day24;

public class I로만들기 {
    public static void main(String[] args) {
        System.out.println(solution("abcdevwxyz"));
        System.out.println(solution("jjnnllkkmm"));
    }
    private static String solution(String myString){
        return myString.replaceAll("[^l-z]", "l");
    }
}
