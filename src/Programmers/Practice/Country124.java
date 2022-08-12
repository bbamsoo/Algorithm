package Programmers.Practice;

public class Country124 {
    public String solution(int n) {
        String []numbers= {"4","1","2"};
        StringBuilder sb = new StringBuilder();
        String answer = "";
        while(n>0) {
            int remainder = n%3;
            n /= 3;
            if(remainder == 0) n--;

            sb.append(numbers[remainder]);
            //answer = numbers[remainder]+answer;
        }
        return sb.reverse().toString();
        //return answer;
    }
}
