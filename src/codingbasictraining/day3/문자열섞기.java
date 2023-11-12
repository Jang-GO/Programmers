package codingbasictraining.day3;

public class 문자열섞기 {
    public static void main(String[] args) {
        String str1 = "aaaaaa";
        String str2 = "bbbbb";
        System.out.println(solution(str1,str2));
    }
    public static String solution(String str1, String str2){
        StringBuilder answer = new StringBuilder();
        char[] str1Arr = str1.toCharArray();
        char[] str2Arr = str2.toCharArray();
        int len = Math.min(str1Arr.length, str2Arr.length);
        for(int i=0; i<len ; i++){
            answer.append(str1Arr[i]);
            answer.append(str2Arr[i]);
        }
        if(len== str1Arr.length){
            answer.append(str2.substring(len));
        }else{
            answer.append(str1.substring(len));
        }
        return answer.toString();
    }
}
