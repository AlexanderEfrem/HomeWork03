package by.AlexanderEfremenko.htp.ClassesAndObjectives.Task01.CallTest01;

import by.AlexanderEfremenko.htp.ClassesAndObjectives.Task01.Test01;

import java.util.Scanner;

public class MainTest01 {

    public static void main (String... args){

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


        Test01 test01 = new Test01(x,y);

        test01.PrintTest01();

        test01.sum();

        test01.findMax();

        test01.setValues(3, 4);
    }

}
