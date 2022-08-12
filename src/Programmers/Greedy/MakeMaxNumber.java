package Programmers.Greedy;

public class MakeMaxNumber {
    public String solution(String number, int k) {
        StringBuilder answer = new StringBuilder();
        int index=0;

        for(int i=0;i<number.length()-k;i++) {
            char max='0';
            for(int j=index;j<=k+i;j++) {
                if(max < number.charAt(j)) {
                    max = number.charAt(j);
                    index = j+1;
                }
            }
            answer.append(max);
        }
        return answer.toString();
    }
}
