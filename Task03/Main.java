package Task03;

import java.util.Scanner;

public class Main {
    public static void main(String... args) {

        Student[] students;
        Scanner sc = new Scanner(System.in);
        students = new Student[3];

        for (int i = 0; i < students.length; i++) {

            System.out.println("Enter Last Name");
            String x = sc.next();

            System.out.println("Enter Group Number");
            while (sc.hasNextInt() == false) {
                sc.next();
                System.out.println("Enter Group Number");
            }
            int y = sc.nextInt();

            int[] performance = new int[5];
            for (int j = 0; j < 5; j++) {
                System.out.println("Enter Mark for the " + j + " Subject");
                while (sc.hasNextInt() == false) {
                    sc.next();
                    System.out.println("Enter Mark for the " + j + " Subject");
                }
                performance[j] = sc.nextInt();
            }
            students[i] = new Student(x, y, performance);
        }
        for (int i = 0; i < students.length; i++) {
          students[i].printBestStudent();
        }
    }
}
