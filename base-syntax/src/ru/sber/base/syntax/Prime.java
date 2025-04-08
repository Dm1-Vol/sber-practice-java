import java.text.BreakIterator;
import java.util.Scanner;

import static java.lang.Math.floor;
import static java.lang.Math.sqrt;

public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("n = ");
        Integer n = in.nextInt();
        Boolean f = false;
        for(int i = 2; i <= floor(sqrt(n)); i++){
            if(n%i == 0){
                f = true;
                System.out.print("Нет");
                break;
            }
        }
        if(!f){
            if(n==1){
                System.out.print("Нет");
            } else {
                System.out.print("Да");
            }
        }
    }
}
