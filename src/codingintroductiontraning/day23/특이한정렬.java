package codingintroductiontraning.day23;

import java.util.Arrays;

public class 특이한정렬 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4, 5, 6}, 4)));
        System.out.println(Arrays.toString(solution(new int[]{10000,20,36,47,40,6,10,7000}, 30)));
    }
    private static int[] solution(int[] numlist, int n){
        Arrays.sort(numlist);
        for(int i=0;i<numlist.length;i++){
            for(int j=0;j<numlist.length;j++){
                if(Math.abs(n-numlist[i]) <= Math.abs(n-numlist[j])){
                    int tmp = numlist[i];
                    numlist[i] = numlist[j];
                    numlist[j] = tmp;
                }
            }
        }
        return numlist;
    }
}
