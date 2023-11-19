package codingintroductiontraning.day8;

public class 외계행성의나이 {
    public static void main(String[] args) {
        int age1 = 23, age2= 51, age3 = 100;
        System.out.println(solution(age1));
        System.out.println(solution(age2));
        System.out.println(solution(age3));
    }
    private static String solution(int age){
        StringBuilder sb = new StringBuilder();
        String aa = String.valueOf(age);
        char[] ss = aa.toCharArray();
        for(char t:ss){
            sb.append((char)(t+49));
        }
        return sb.toString();
    }
}
