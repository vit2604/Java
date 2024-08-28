package test;
import java.util.Scanner;

public class btaparrays {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("nhap so phan tu : ");
        int a =keyboard.nextInt();
        int[] number = new int [a];
        float sum=0;
        for(int i = 0 ; i<number.length ; i++)
        {
            System.out.print("Nhap phan tu thu "+(i+1)+" la : ");
            number[i]=keyboard.nextInt();
            sum +=number[i];
        }
        System.out.printf("Trung binh cong cua mang la : %.1f ",sum/a);
        System.out.println("Xin cam on");
    }
}
