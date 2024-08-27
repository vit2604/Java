
package soxo;

import java.util.Random;
import java.util.Scanner;

public class soxo {
    public static void main(String[] args) {
        Random rand= new Random();
        int result = rand.nextInt(100)+1;
        System.out.println("Ket qua la : "+result);
    }
}
