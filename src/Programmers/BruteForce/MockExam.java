package Programmers.BruteForce;

import java.util.ArrayList;

public class MockExam {
    public int[] solution(int[] answers) {
        int []student1= {1,2,3,4,5};
        int []student2= {2, 1, 2, 3, 2, 4, 2, 5};
        int []student3= {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int count1=0, count2=0,count3=0;

        for(int i=0;i<answers.length;i++) {
            if(student1[i%student1.length] == answers[i])
                count1++;
            if(student2[i%student2.length] == answers[i])
                count2++;
            if(student3[i%student3.length] == answers[i])
                count3++;
        }
        int max=Math.max(Math.max(count1, count2), count3);
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(count1 == max) list.add(1);
        if(count2 == max) list.add(2);
        if(count3 == max) list.add(3);

        int[] answer = new int[list.size()];
        for(int i=0;i<list.size();i++)
            answer[i]=list.get(i);

        return answer;
    }
}
