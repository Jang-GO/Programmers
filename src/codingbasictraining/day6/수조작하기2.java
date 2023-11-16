package codingbasictraining.day6;

public class 수조작하기2 {
    public static void main(String[] args) {
        int[] numLog = {0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1};
        System.out.println(solution(numLog));
    }

    private static String solution(int[] numLog){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<numLog.length-1;i++){
            switch (numLog[i + 1] - numLog[i]) {
                case 1 -> sb.append("w");
                case -1 -> sb.append("s");
                case 10 -> sb.append("d");
                case -10 -> sb.append("a");
                default ->{}
            }
        }
        return sb.toString();
    }
}
