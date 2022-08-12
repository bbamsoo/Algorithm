package Programmers.Practice;

public class LengthOfVisit {
    public int solution(String dirs) {
        boolean [][]visited=new boolean[21][21];
        int x=5;int y=5;
        int answer = 0;
        for(int i=0;i<visited.length;i++)
            for(int j=0;j<visited[0].length;j++)
                visited[i][j]=false;

        for(int i=0;i<dirs.length();i++) {

            if(dirs.charAt(i) == 'U' && y<10) {
                if(visited[x*2][y*2+1]==false) {
                    answer++;
                    visited[x*2][y*2+1]=true;
                }
                y++;
            }
            else if(dirs.charAt(i) == 'L'&& x>0) {
                if(visited[x*2-1][y*2]==false) {
                    answer++;
                    visited[x*2-1][y*2]=true;
                }
                x--;
            }
            else if(dirs.charAt(i) == 'R' && x<10) {
                if(visited[x*2+1][y*2]==false) {
                    answer++;
                    visited[x*2+1][y*2]=true;
                }
                x++;
            }
            else if(dirs.charAt(i) == 'D' && y>0) {
                if(visited[x*2][y*2-1]==false) {
                    answer++;
                    visited[x*2][y*2-1]=true;
                }
                y--;
            }
        }
        return answer;
    }
}
