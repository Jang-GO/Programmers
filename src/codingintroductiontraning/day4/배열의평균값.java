package codingintroductiontraning.day4;

import java.util.Arrays;

public class 배열의평균값 {
    public static void main(String[] args) {
        int[] numbers1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] numbers2 = {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};

        long beforeTime = System.currentTimeMillis();
        System.out.println(solution1(numbers1));
        System.out.println(solution1(numbers2));
        long afterTime = System.currentTimeMillis();
        long secDiffTime = (afterTime - beforeTime); //두 시간에 차 계산
        System.out.println("스트림 실행 시간(m) : "+secDiffTime);

        long beforeTime1 = System.currentTimeMillis();
        System.out.println(solution2(numbers1));
        System.out.println(solution2(numbers2));
        long afterTime1 = System.currentTimeMillis();
        long secDiffTime1 = (afterTime1 - beforeTime1);
        System.out.println("직접 더하기 실행 시간(m) : "+secDiffTime1);
    }

    private static double solution1(int[] numbers) {
        return Arrays.stream(numbers).average().getAsDouble();
    }
    private static double solution2(int[] number){
        int sum=0;
        for(int ss: number){
            sum+=ss;
        }
        return (double)sum / number.length;
    }
}
