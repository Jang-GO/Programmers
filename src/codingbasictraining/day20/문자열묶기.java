package codingbasictraining.day20;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class 문자열묶기 {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"a","bc","d","efg","hi"}));
    }
    private static int solution(String[] strArr){
        Map<Integer,Integer> countMap = new HashMap<>();
        for(String ss:strArr){
            int i = countMap.getOrDefault(ss.length(), 0) + 1;
            countMap.put(ss.length(),i);
        }
        Map.Entry<Integer, Integer> maxEntry = null;
        Set<Map.Entry<Integer, Integer>> entries = countMap.entrySet();
        for(Map.Entry<Integer,Integer> ss :entries){
            if(maxEntry==null||ss.getValue()> maxEntry.getValue()){
                maxEntry = ss;
            }
        }
        return maxEntry.getValue();
    }
}
