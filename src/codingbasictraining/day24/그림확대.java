package codingbasictraining.day24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 그림확대 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{".xx...xx.", "x..x.x..x", "x...x...x", ".x.....x.", "..x...x..", "...x.x...", "....x...."},2)));
        System.out.println(Arrays.toString(solution(new String[]{"x.x", ".x.", "x.x"},3)));
    }
    private static String[] solution(String[] picture, int k){
        List<String> list = new ArrayList<>();
        for(String pixel:picture){
            String tmp="";
            for(int i=0;i< pixel.length();i++){
                for(int j=0;j<k;j++){
                    tmp+=pixel.charAt(i);
                }
            }
            for(int i=0;i<k;i++){
                list.add(tmp);
            }
        }
        return list.toArray(new String[0]);
    }
}
