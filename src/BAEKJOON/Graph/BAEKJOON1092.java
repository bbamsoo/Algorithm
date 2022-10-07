package BAEKJOON.Graph;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class BAEKJOON1092 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n=Integer.parseInt(br.readLine());
        ArrayList<Integer> cranes = new ArrayList<>();
        ArrayList<Integer> box = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for (int i=0;i<n;i++){
            cranes.add(Integer.parseInt(st.nextToken()));
        }
        int m=Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine()," ");
        for(int i=0;i<m;i++){
            box.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(cranes,Collections.reverseOrder());
        Collections.sort(box,Collections.reverseOrder());
        if(cranes.get(0)<box.get(0)) {
            bw.write(-1+"");
            bw.flush();
            bw.close();
            br.close();
            return;
        }
        int time=0;
        while (!box.isEmpty()) {
            int index=0;
            for(int i=0;i<cranes.size();){
                if(index==box.size()) break;
                else if(cranes.get(i)>=box.get(index)){
                    box.remove(index);
                    i++;
                }else index++;
            }
            time++;
        }
        bw.write(time+"");
        bw.flush();
        bw.close();
        br.close();
    }
}