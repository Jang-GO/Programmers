package codingintroductiontraning.day23;

import java.util.ArrayList;
import java.util.List;

public class 로그인성공 {
    private static final String LOGIN = "login";
    private static final String FAIL = "fail";
    private static final String WRONGPW = "wrong pw";
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"meosseugi", "1234"},new String[][]{{"rardss", "123"},{"yyoom", "1234"},{"meosseugi", "1234"}}));
        System.out.println(solution(new String[]{"programmer01", "15789"},new String[][]{{"programmer01", "1145"},{"programmer00", "134"},{"programmer02", "111111"}}));
        System.out.println(solution(new String[]{"rabbit04", "98761"},new String[][]{{"jaja11", "98761"},{"krong0313", "29440"},{"rabbit00", "111333"}}));
    }
    private static String solution(String[] id_pw, String[][] db){
        List<String> list = new ArrayList<>();
        for(String[] combi:db){
            if(id_pw[0].equals(combi[0])){
                if(id_pw[1].equals(combi[1])) {
                    return LOGIN;
                }
                else {
                    list.add(WRONGPW);
                }
            }else{
                list.add(FAIL);
            }
        }
        if(list.contains(WRONGPW)) return WRONGPW;
        else return FAIL;
    }
}
