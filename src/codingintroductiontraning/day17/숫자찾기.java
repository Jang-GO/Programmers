package codingintroductiontraning.day17;

public class 숫자찾기 {
    public static void main(String[] args) {
        System.out.println(solution(29183,1));
        System.out.println(solution(232443,4));
        System.out.println(solution(123456,7));
    }
    private static int solution(int num, int k){
        String[] arr = String.valueOf(num).split("");
        int idx=1;
        for(String ss:arr){
            if(Integer.parseInt(ss)==k){
                return idx;
            }
            idx++;
        }
        return -1;
    }
}
