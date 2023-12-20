package codingintroductiontraning.day21;

public class 삼각형의완성조건2 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,2}));
        System.out.println(solution(new int[]{3,6}));
        System.out.println(solution(new int[]{11,7}));
    }
    private static int solution(int[] sides){
        int cnt=0;
        int maxRange = sides[0]+sides[1];
        cnt+=maxRange-Math.max(sides[0],sides[1]);
        cnt+=Math.min(sides[0],sides[1])-1;
        return cnt;
    }
}
