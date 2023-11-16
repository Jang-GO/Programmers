package codingbasictraining.day5;

public class 이어붙인수 {
    public static void main(String[] args) {
        int[] num_list1 = new int[]{3,4,5,2,1};
        int[] num_list2 = new int[]{5,7,8,3};

        System.out.println(solution(num_list1));
        System.out.println(solution(num_list2));
    }

    private static int solution(int[] num_list) {
        int odd = 0, even = 0;
        String oddStr = "", evenStr ="";
        for(int i=0;i<num_list.length;i++){
            if(num_list[i]%2==0){
                evenStr += num_list[i];
            }else{
                oddStr +=num_list[i];
            }
        }
        odd = Integer.parseInt(oddStr);
        even = Integer.parseInt(evenStr);

        return odd+even;
    }
}
