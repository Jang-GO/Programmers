package codingintroductiontraning.day5;

public class 나이출력 {
    private static final int curYear = 2022;
    public static void main(String[] args) {
        int age1 = 40, age2=23;
        System.out.println(solution(age1));
        System.out.println(solution(age2));
    }

    private static int solution(int age) {
        return curYear - age +1;
    }
}
