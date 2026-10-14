
import java.util.Scanner;

public class studentmarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student's name: ");
        String name = sc.nextLine();

        System.out.print("Enter mark in Subject 1: ");
        int m1 = sc.nextInt();

        System.out.print("Enter mark in Subject 2: ");
        int m2 = sc.nextInt();

        System.out.print("Enter mark in Subject 3: ");
        int m3 = sc.nextInt();

        System.out.print("Enter mark in Subject 4: ");
        int m4 = sc.nextInt();

        System.out.print("Enter mark in Subject 5: ");
        int m5 = sc.nextInt();

        int total = m1 + m2 + m3 + m4 + m5;
        double average = total / 5.0;

        System.out.println("\nStudent Name: " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + average);

        sc.close();
    }
}
