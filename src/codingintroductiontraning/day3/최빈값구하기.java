package codingintroductiontraning.day3;

import java.util.HashMap;
import java.util.Map;

public class 최빈값구하기 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,2,3,3,3,4}));
        System.out.println(solution(new int[]{1,1,2,2}));
        System.out.println(solution(new int[]{1}));
    }
    public static int solution(int[] array) {
        int maxCount = 0;
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int number : array){
            int count = map.getOrDefault(number, 0) + 1;
            if(count > maxCount){
                maxCount = count;
                answer = number;
            }
            else  if(count == maxCount){
                answer = -1;
            }
            map.put(number, count);
        }
        return answer;
    }
}
