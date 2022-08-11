package Programmers.Hash;

import java.util.HashMap;
import java.util.Map;

public class Camouflage {
    public int solution(String[][] clothes) {
        Map<String, Integer> combine = new HashMap<>();
        int answer = 1;

        for(int i=0;i<clothes.length;i++) {
            combine.put(clothes[i][1], combine.getOrDefault(clothes[i][1], 0)+1);
        }
        for(String key:combine.keySet()) {
            answer*=combine.get(key)+1;
        }

        return answer-1;
    }
}
