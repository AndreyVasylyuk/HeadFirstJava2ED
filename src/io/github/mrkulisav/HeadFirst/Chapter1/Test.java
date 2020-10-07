package io.github.mrkulisav.HeadFirst.Chapter1;

public class Test {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        
        while(x < 5) {
            
            // add needed code below
            if ( y < 5 ) {
                x = x + 1;
                if ( y < 3 ) {
                    x = x - 1;
                }
            }
            y = y + 2;
            
            System.out.print(x + "" + y + " ");
            x = x + 1;
        }
    }

}

/* 
1) y = x - y; -> 00 11 21 32 42 
2) y = y + x; -> 00 11 23 36 410 
3) y = y + 2; -> 02 14 25 36 47 
    if(y > 4) {
    y = y - 1;
    }
4)  x = x + 1; -> 11 34 59 
    y = y + x;
5) if ( y < 5 ) { -> 02 14 36 48 
                x = x + 1;
                if ( y < 3 ) {
                    x = x - 1;
                }
            }
            y = y + 2;
*/