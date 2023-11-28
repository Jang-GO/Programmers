package codingintroductiontraning.day14;

public class 대문자와소문자 {
    public static void main(String[] args) {
        System.out.println(solution("cccCCC"));
        System.out.println(solution("abCdEfghIJ"));
    }
    private static String solution(String my_string){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<my_string.length();i++){
            if(Character.isUpperCase(my_string.charAt(i))) sb.append(Character.toLowerCase(my_string.charAt(i)));
            else sb.append(Character.toUpperCase(my_string.charAt(i)));
        }
        return sb.toString();
    }
}
