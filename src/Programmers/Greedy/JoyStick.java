package Programmers.Greedy;

public class JoyStick {
    public int solution(String name) {
        int answer = 0;

        int move = name.length()-1;

        for(int i=0;i<name.length();i++) {
            answer+=Math.min(name.charAt(i)-'A', 'Z'-name.charAt(i)+1);

            int end = i+1;
            while(end<name.length() && name.charAt(end) == 'A')
                end++;

            move = Math.min(move,i*2+(name.length()-end));
            move = Math.min(move,i+2*(name.length()-end));
        }

        return answer+move;
    }
}
