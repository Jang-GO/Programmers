package codingbasictraining.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 문자열겹쳐쓰기 {
    public static void main(String[] args) throws IOException {
        String str1 = "He11oWor1d";
        String str2 = "lloWorl";
        int a1 = 2;

        String str3 = "Program29b8UYP";
        String str4 = "merS123";
        int a2 = 7;

        System.out.println(solution(str1, str2, a1));
        System.out.println(solution(str3, str4, a2));
    }
    public static String solution(String my_string, String overwrite_string, int s) {
        String answer="";
        String prestr = my_string.substring(0,s);
        String sufstr = my_string.substring(s+overwrite_string.length());
        answer = prestr+overwrite_string+sufstr;
        return answer;
    }
}
