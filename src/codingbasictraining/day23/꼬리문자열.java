package codingbasictraining.day23;

public class 꼬리문자열 {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"abc", "def", "ghi"}, "ef"));
        System.out.println(solution(new String[]{"abc", "bbc", "cbc"}, "c"));
    }
    private static String solution(String[] str_list,String ex){
        StringBuilder sb = new StringBuilder();
        for(String elm:str_list){
            if(!elm.contains(ex)) sb.append(elm);
        }
        return sb.toString();
    }
}
