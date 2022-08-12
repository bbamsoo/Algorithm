package Programmers.Practice;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class OpenChatingRoom {
    public String[] solution(String[] record) {

        ArrayList<String> message = new ArrayList<>();

        Map<String,String> room = new LinkedHashMap<>();

        for(int i=0;i<record.length;i++) {
            String []split = record[i].split(" ");
            if(split[0].equals("Enter")) {
                room.put(split[1], split[2]);
                message.add(split[1]+"님이 들어왔습니다.");
            }
            else if(split[0].equals("Leave")) {
                message.add(split[1]+"님이 나갔습니다.");
            }
            else if(split[0].equals("Change")) {
                room.put(split[1], split[2]);
            }
        }
        String[] answer = new String [message.size()];
        int index=0;

        for(String str:message) {
            String id = str.substring(0,str.indexOf('님'));

            answer[index++] = str.replace(id, room.get(id));
        }
        return answer;
    }
}
