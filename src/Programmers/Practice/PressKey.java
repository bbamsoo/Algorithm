package Programmers.Practice;

public class PressKey {
    public String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();
        int left=10,right=12;

        for(int num:numbers) {
            if(num == 1 ||num == 4 ||num == 7) {
                sb.append('L');
                left=num;
            }
            else if(num == 3 ||num == 6 ||num == 9) {
                sb.append('R');
                right=num;
            }
            else {
                if(num==0) num=11;
                int leftdist = Math.abs(num-left)/3+Math.abs(num-left)%3;
                int rightdist = Math.abs(num-right)/3+Math.abs(num-right)%3;

                if(leftdist<rightdist){
                    sb.append('L');
                    left = num;
                }
                else if(leftdist>rightdist){
                    sb.append('R');
                    right = num;
                }
                else{
                    if(hand.equals("left")){
                        sb.append('L');
                        left = num;
                    }else{
                        sb.append('R');
                        right = num;
                    }
                }
            }
        }
        return sb.toString();
    }
}
