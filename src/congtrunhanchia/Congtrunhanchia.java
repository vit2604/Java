
package congtrunhanchia;

import java.util.Scanner;

public class Congtrunhanchia {

    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner (System.in);
        System.out.println("Nhap vao so nguyen thu 1 :");
        int x =keyboard.nextInt();
        System.out.println("Nhap vao so nguyen thu 2 :");
        int y = keyboard.nextInt();
        System.out.println("a + b = " + ( x + y ) );
        System.out.println("a - b = " + (x - y) );
        System.out.println("a * b = " + (x * y) );
        if(y==0){
            System.out.println("Khong the chia cho 0.");
        }else{
        System.out.println("a / b = " + (x / y) );
        }
        System.out.println("a chia lay phan du b = " + (x % y) );
    }}
