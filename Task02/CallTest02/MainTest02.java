package by.AlexanderEfremenko.htp.ClassesAndObjectives.Task02.CallTest02;

import by.AlexanderEfremenko.htp.ClassesAndObjectives.Task02.Test2;

import java.util.Scanner;

public class MainTest02 {

    public static void main(String... args) {
        int x;
        int y;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter x ");
        while (sc.hasNextInt() == false) {
            sc.next();
            System.out.println("Enter x");
        }
        x = sc.nextInt();

        System.out.println("Enter y ");
        while (sc.hasNextInt() == false) {
            sc.next();
            System.out.println("Enter y");
        }
        y = sc.nextInt();

        Test2 test02 = new Test2();

        test02.printTest02();

        Test2 test03 = new Test2(x,y);

        test03.setValues(x, y);

        System.out.println("X = " + test03.getPeremennaya1());

        System.out.println("Y = " + test03.getPeremennaya2());
    }


}
