
package nhapthongtin;
import java.util.Scanner;
public class nhapthongtin {
     public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter name:");
        String name=keyboard.nextLine();
        System.out.println("Enter age:");
        int age = keyboard.nextInt();
        keyboard.nextLine();
        System.out.println("Enter born year : ");
        int year = keyboard.nextInt();
        keyboard.nextLine();
        System.out.println("Enter sex :");
        String sex=keyboard.nextLine();
        System.out.println("Enter chuyen nganh : ");
        String chuyennganh=keyboard.nextLine();
        System.out.println("Enter GPA : ");
        Float gpa=keyboard.nextFloat();
        keyboard.nextLine();
        System.out.println("Enter the tower : ");
        String quequan=keyboard.nextLine();
        keyboard.nextLine();
        System.out.println("Information of :"+name);
        System.out.println("Age : "+age);
        System.out.println("Year : "+year);
        System.out.println("Sex : "+sex);
        System.out.println("Chuyen nganh : "+chuyennganh);
        System.out.println("GPA : "+gpa);
        System.out.println("Tower : "+quequan);
    }
}
