package Programmers.Hash;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int select = nums.length/2;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int n:nums)
            map.put(n,map.getOrDefault(n, 0)+1);
        if(map.size()<select)
            answer = map.size();
        else
            answer = select;

        return answer;
    }
}
