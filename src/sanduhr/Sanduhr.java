package sanduhr;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author: lasse
 */
public class Sanduhr {
    private final int zeilen;

    public Sanduhr(int zeilen){
        this.zeilen = zeilen;
    }

    public void printSanduhr(){
        int stars = zeilen;
        for(int i = 0; i < zeilen; i++){
            if(i<zeilen/2){
                int space = needSpaces(stars);
                for(int j = 0; j < space; j++){
                    printSpace();
                }
                for(int j = 0; j < stars; j++){
                    printStar();
                }
                for(int j = 0; j < space; j++){
                    printSpace();
                }
                System.out.println();
                stars = stars - 2;
            } else{
                int space = needSpaces(stars);
                for(int j = 0; j < space; j++){
                    printSpace();
                }
                for(int j = 0; j < stars; j++){
                    printStar();
                }
                for(int j = 0; j < space; j++){
                    printSpace();
                }
                System.out.println();
                stars = stars + 2;
            }
        }
    }

    private void printStar(){
        System.out.print("*");
    }

    private void printSpace(){
        System.out.print(" ");
    }

    private int needSpaces(int stars){
        int space = (zeilen-stars)/2;
        return space;
    }
}
