package codingbasictraining.day3;

public class 더크게합치기 {
    public static void main(String[] args) {
        더크게합치기 main = new 더크게합치기();
        int a1 = 9;
        int b1 = 91;
        int a2 = 89;
        int b2 = 8;

        System.out.println(main.solution(a1,b1));
        System.out.println(main.solution(a2,b2));
    }
    public int solution(int a, int b) {
        String aStr = String.valueOf(a);
        String bStr = String.valueOf(b);

        String tmp1 = aStr + bStr;
        String tmp2 = bStr + aStr;

        return Math.max(Integer.parseInt(tmp1),Integer.parseInt(tmp2));
    }
}
