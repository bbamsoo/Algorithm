package Programmers.Hash;

import java.util.HashMap;
import java.util.Map;

public class Unfinished_Player {
    public String solution(String[] participant, String[] completion) {
        Map<String,Integer> map = new HashMap<>();
        String answer = "";
        for(String part:participant) {
            map.put(part, map.getOrDefault(part, 0) + 1);
        }
        for(String part:completion) {
            map.put(part, map.getOrDefault(part, 0) - 1);
        }
        for(String comple:map.keySet()) {
            if(map.get(comple)!=0) {
                answer = comple;
                break;
            }
        }

        return answer;
    }
}
