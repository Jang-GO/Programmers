package codingintroductiontraning.day9;

public class 구슬을나누는경우의수 {
    public static void main(String[] args) {
        System.out.println(solution(3,2));
        System.out.println(solution(5,3));
    }
    private static int solution(int balls, int share){
        return combination(balls,share);
    }
    private static int combination(int balls, int share){
        if(balls==share || share==0){
            return 1;
        }
        else return combination(balls-1,share-1) + combination(balls-1,share);
    }
}
