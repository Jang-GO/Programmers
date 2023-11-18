package codingbasictraining.day8;

public class 글자이어붙여문자열만들기 {
    public static void main(String[] args) {
        String my_string1 = "cvsgiorszzzmrpaqpe";
        String my_string2 = "zpiaz";

        int[] index_list1 = {16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7};
        int[] index_list2 = {1, 2, 0, 0, 3};
        System.out.println(solution(my_string1,index_list1));
        System.out.println(solution(my_string2,index_list2));
    }
    private static String solution(String my_string, int[] index_list){
        String answer="";
        for(int index:index_list){
            answer+=my_string.charAt(index);
        }
        return answer;
    }
}
