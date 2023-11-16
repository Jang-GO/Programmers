package codingbasictraining.day5;

public class 원소들의곱과합 {
    public static void main(String[] args) {
        int[] num_list1 = {3,4,5,2,1};
        int[] num_list2 = {5,7,8,3};

        System.out.println(solution(num_list1));
        System.out.println(solution(num_list2));
    }

    private static int solution(int[] numList) {
        int multSum = 1;
        int powSum =0;
        for(int i=0;i<numList.length;i++){
            multSum *=numList[i];
            powSum+=numList[i];
        }
        return (multSum > powSum*powSum) ? 0 : 1;
    }
}
