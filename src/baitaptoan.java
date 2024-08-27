package baitaptoan;

import java.util.Random;
import java.util.Scanner;

public class baitaptoan {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Ban co 3 luot");
        play();
        Random rand = new Random();
        int wrong = 3;

        while (wrong != 0) {
            play();
            wrong--;
        }
        System.out.println("-----BAN DA THUA-----");

    }

    public static void play() {
        Random rand = new Random();
        Scanner keyboard = new Scanner(System.in);
        int a = rand.nextInt(2) + 2;
        int sum = 0;
        int point = 0;
        for (int sohang = 0; sohang <= a; sohang++) {
            if (sohang == a) {
                int sh2 = rand.nextInt(10) + 1;
                System.out.println(sh2 + " = ");
                sum = sum + sh2;

            } else {
                int sh1 = rand.nextInt(10) + 1;
                sum = sum + sh1;
                System.out.print(sh1 + "+");
            }
        }
        int result = keyboard.nextInt();
        if (result == sum) {
            System.out.println("dung");
        } else {
            System.out.println("sai");
        }
        System.out.println(point + " diem");
        return;

    }
}
