package codingbasictraining.day22;

import java.math.BigDecimal;

public class 두수의합 {
    public static void main(String[] args) {
        System.out.println(solution("582","734"));
        System.out.println(solution("18446744073709551615","287346502836570928366"));
        System.out.println(solution("0","0"));
    }
    private static String solution(String a, String b){
        BigDecimal ds = new BigDecimal(a);
        BigDecimal da = new BigDecimal(b);
        BigDecimal add = ds.add(da);
        return String.valueOf(add);
    }
}
