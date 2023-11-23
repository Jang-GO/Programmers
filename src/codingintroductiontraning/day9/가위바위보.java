package codingintroductiontraning.day9;

public class 가위바위보 {
    public static void main(String[] args) {
        System.out.println(solution("2"));
        System.out.println(solution("205"));
    }
    private static String solution(String rsp){
        String[] arr = rsp.split("");
        StringBuilder sb = new StringBuilder();
        for(String s : arr) {
            if(s.equals("2")) sb.append("0");
            else if(s.equals("0")) sb.append("5");
            else sb.append("2");
        }
        return sb.toString();
    }
}
