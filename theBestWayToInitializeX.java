package henu;

import java.util.Random;

public class theBestWayToInitializeX {
    public static void main(String[] args) {
        int x;
        do{
            x = new Random().nextInt();
        }while (x!=10);
        System.out.println(x);
    }
}
