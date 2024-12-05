
package tinhtong;

import java.util.Scanner;

public class tinhtong {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int sum=0;
        int number = 1;
        while(number!=0)
        {
            System.out.println("Enter a number (0 to quit): ");
            number = keyboard.nextInt();
            sum +=number;
        }
        System.out.println("The total is "+sum);
    }
}
