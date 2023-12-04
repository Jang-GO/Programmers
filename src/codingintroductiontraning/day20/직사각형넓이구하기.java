package codingintroductiontraning.day20;

public class 직사각형넓이구하기 {
    public static void main(String[] args) {
        System.out.println(solution(new int[][] {{1,1},{2,1},{2,2},{1,2}}));
        System.out.println(solution(new int[][] {{-1,-1},{1,1},{1,-1},{-1,1}}));
    }
    private static int solution(int[][] dots){
        int maxX = Integer.MIN_VALUE;
        int minX =Integer.MAX_VALUE;
        int maxY = Integer.MIN_VALUE;
        int minY= Integer.MAX_VALUE;
        for(int i=0;i<dots.length;i++){
            if(dots[i][0]>maxX) maxX = dots[i][0];
            if(dots[i][0]<minX) minX = dots[i][0];
        }
        for(int i=0;i<dots.length;i++){
            if(dots[i][1]>maxY) maxY = dots[i][1];
            if(dots[i][1]<minY) minY = dots[i][1];
        }
        return (maxX-minX) * (maxY-minY);
    }
}
