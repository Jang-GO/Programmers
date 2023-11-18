package codingbasictraining.day8;

public class 간단한논리연산 {
    public static void main(String[] args) {
        boolean x1 = false, x2=true, x3 = true, x4 = true;
        boolean x5 = true, x6=false, x7 = false, x8 = false;

        System.out.println(solution(x1,x2,x3,x4));
        System.out.println(solution(x5,x6,x7,x8));
    }

    private static boolean solution(boolean x1, boolean x2, boolean x3, boolean x4){
        return (x1||x2)&&(x3||x4);
    }
}
