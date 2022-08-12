package Programmers.Practice;

import java.util.LinkedList;

public class Cashe {
    public int solution(int cacheSize, String[] cities) {
        if(cacheSize == 0) return 5 * cities.length;

        int answer = 0;

        LinkedList<String> cache = new LinkedList<>();

        for(int i = 0 ; i < cities.length ; ++i){
            String city = cities[i].toLowerCase();

            if(cache.remove(city)){
                cache.addFirst(city);
                answer += 1;

            } else {

                if(cache.size() == cacheSize){
                    cache.pollLast();
                }

                cache.addFirst(city);
                answer += 5;
            }
        }
        return answer;
    }
}
