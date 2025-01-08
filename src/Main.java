import sanduhr.Sanduhr;
import sanduhr.Sanduhr_rekursiv;

/**
 * @author: lasse
 */

public class Main {
    public static void main(String[] args){
        int zeilen = Integer.parseInt(args[0]);
        int moduloZeilen = zeilen % 2;

        if(zeilen<5){
            System.out.println("Die Anzahl der Zeilen ist zu gering!");
        } else if (moduloZeilen == 0) {
            System.out.println("Die Anzahl der Zeilen muss ungerade sein");
        } else {
            new Sanduhr_rekursiv(zeilen).printSanduhr();
        }
    }
}