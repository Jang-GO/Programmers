package codingintroductiontraning.day10;

import java.util.Arrays;

public class 배열회전시키기 {
    public static void main(String[] args) {
        int[] numbers = new int[]{1,2,3};
        String direction = "right";
        System.out.println(Arrays.toString(solution(numbers,direction)));
    }
    private static int[] solution(int[] numbers, String direction){
        int start = numbers[0];
        int end = numbers[numbers.length-1];
        if(direction.equals("right")){
            for(int i=numbers.length-1;i>0;i--){
                numbers[i] = numbers[i-1];
            }
            numbers[0] = end;
        }else{
            for(int i=1;i<numbers.length;i++){
                numbers[i-1]=numbers[i];
            }
            numbers[numbers.length-1] = start;
        }
        return numbers;
    }
}
