package codingintroductiontraning.day4;

public class 피자나눠먹기3 {
    public static void main(String[] args) {
        int slice1 = 7, slice2 = 4;
        int n1 = 10, n2 = 12;
        System.out.println(solution(slice1, n1));
        System.out.println(solution(slice2, n2));
    }

    private static int solution(int slice, int n) {
        return (n%slice==0) ? n/slice : n/slice+1;
    }
}
