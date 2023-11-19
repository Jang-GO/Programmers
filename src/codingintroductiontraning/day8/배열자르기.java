package codingintroductiontraning.day8;

import java.util.Arrays;

public class 배열자르기 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        int num1 = 1, num2 = 3;
        System.out.println(Arrays.toString(solution(numbers,num1,num2)));
    }
    private static int[] solution(int[] numbers, int num1, int num2){
        int[] answer = new int[numbers.length-num2+num1];
        int j=0;
        for(int i=num1;i<=num2;i++){
            answer[j] = numbers[i];
            j++;
        }
        return answer;
        // or return Arrays.copyOfRange(numbers,num1,num2+1);
    }
}
