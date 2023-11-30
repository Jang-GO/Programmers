package codingintroductiontraning.day16;

public class 배열의유사도 {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"a", "b", "c"},new String[]{"com", "b", "d", "p", "c"}));
        System.out.println(solution(new String[]{"n", "omg"},new String[]{"m", "dot"}));
    }
    private static int solution(String[] s1, String[] s2){
        int count =0;
        for(String st1:s1){
            for(String st2:s2){
                if(st1.equals(st2)){
                    count++;
                }
            }
        }
        return count;
    }
}
