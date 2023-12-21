package codingintroductiontraning.day22;

public class 평행 {
    public static void main(String[] args) {
        System.out.println(solution(new int[][]{{1,4},{9,2},{3,8},{11,6}}));
        System.out.println(solution(new int[][]{{3,5},{4,1},{2,4},{5,10}}));
    }
    private static int solution(int[][] dots) {
        int answer=0;
        if(getSlope(dots[0],dots[1])==getSlope(dots[2],dots[3])) return 1;
        if(getSlope(dots[0],dots[2])==getSlope(dots[1],dots[3])) return 1;
        if(getSlope(dots[0],dots[3])==getSlope(dots[1],dots[2])) return 1;
        return answer;
    }

    private static double getSlope(int[] dot1, int [] dot2){
        return (double)(dot2[1]-dot1[1])/(double)(dot2[0]-dot1[0]);
    }
}
