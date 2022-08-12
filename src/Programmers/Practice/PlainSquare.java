package Programmers.Practice;

public class PlainSquare {
    public long solution(int w, int h) {
        long crash = 0;
        if(w == h)
            crash=w;
        else {
            int gcd=w>h?gcd(h,w):gcd(w,h);
            crash=w+h-gcd;
        }

        return (long)w*h-crash;
    }
    int gcd(int a, int b) {

        if(b==0) return a;
        return gcd(b,a%b);
    }
}
