package sanduhr;

/**
 * @author: lasse
 */
public class Sanduhr_rekursiv {
    private int counter = 0;
    private final int zeilen;

    public Sanduhr_rekursiv(int zeilen){
        this.zeilen = zeilen;
    }

    public void printSanduhr() {
        int stars = zeilen;
        printSanduhrLine(stars, 0, true);
    }

    private void printSanduhrLine(int stars, int spaces, boolean shrinking){
        if(shrinking == true){
            for (int i = 0; i < spaces; i++){
                printSpace();
            }
            for (int i = 0; i < stars; i++){
                printStar();
            }
            for (int i = 0; i < spaces; i++){
                printSpace();
            }
            if (stars == 3){
                shrinking = false;
            }
            System.out.println();
            printSanduhrLine(stars-2,spaces+1,shrinking);
        }else {
            for (int i = 0; i < spaces; i++){
                printSpace();
            }
            for (int i = 0; i < stars; i++){
                printStar();
            }
            for (int i = 0; i < spaces; i++){
                printSpace();
            }
            if (!shrinking && stars < zeilen){
                System.out.println();
                printSanduhrLine(stars+2,spaces-1,shrinking);
            }
        }
    }

    private void printStar(){
        System.out.print("*");
    }

    private void printSpace(){
        System.out.print(" ");
    }
}
