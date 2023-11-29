package codingbasictraining.day15;

import java.util.Arrays;

public class 조건에맞게수열변환하기2 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 100, 99, 98}));
    }
    private static int solution(int[] arr) {
        int cnt=0;
        int answer=0;
        int[] beforeArr = new int[arr.length];
        while(cnt!=arr.length){
            cnt=0;
            beforeArr = arr.clone();
            for(int i =0; i<arr.length; i++) {
                if (arr[i] % 2 == 0 && arr[i] >= 50) {
                    arr[i] /= 2;
                } else if (arr[i] % 2 != 0 && arr[i] < 50) {
                    arr[i] = arr[i] * 2 + 1;
                }
                if(arr[i]==beforeArr[i]) cnt++;
            }
            answer++;
        }
        return answer-1;
    }
}
