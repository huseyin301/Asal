package AsalSayilar;

import java.util.Scanner;

public class Cod {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int  i, b ;
        for( b=2 ; b<=100 ;b++) {
            int counter = 0;
            for (i = 1; i <= b; i++) {

                if (b % i == 0) {
                    counter++;
                }


            }
            if (counter == 2) {
                System.out.println(b);
            }
        }
    }
}
