package codingintroductiontraning.day24;

public class 치킨쿠폰 {
    public static void main(String[] args) {
        System.out.println(solution(100));
        System.out.println(solution(1081));
    }
    private static int solution(int chicken){
        int coupon=chicken;
        int cnt =0;
        while(coupon>=10){
            int leftCoupon = coupon %10;
            cnt += coupon/10;
            coupon = leftCoupon + coupon/10;
        }
        return cnt;
    }
}
