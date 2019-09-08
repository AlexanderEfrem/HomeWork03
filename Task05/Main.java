package Task05;

import java.util.Scanner;

public class Main {

    public static void main(String... args) {

        Scanner sc = new Scanner(System.in);
        CounterLogic counterLogic = new CounterLogic();
        Counter counter = new Counter();

        System.out.println("Choose What you want:" + "\n 1.Set-up your Counter with default values" + "\n 2.Set-up your Counter with your values");
        while (sc.hasNextInt() == false) {
            sc.next();
            System.out.println("Choose What you want:" + "\n 1. Enter 1 to set-up your Counter with default values" + "\n 2. Enter 2 to set-up your Counter with your values");
        }
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                break;
            case 2:
                counter = counterLogic.setCounter();
                break;
        }

        loop:
        while (true) {
            System.out.println("Great Work!");
            System.out.println("Now choose what you want to do with your counter:" + "\n 1.Increase value of your Counter" + "\n 2.Decrease value of your Counter" + "\n 3.Get information about your Counter" + "\n 4.Quite");
            while (sc.hasNextInt() == false) {
                sc.next();
                System.out.println("Now choose what you want to do with your counter:" + "\n 1.Increase value of your Counter" + "\n 2.Decrease value of your Counter" + "\n 3.Get information about your Counter" + "\n 4.Quite");
            }
            int secondChoice = sc.nextInt();

            switch (secondChoice) {
                case 1:
                    counterLogic.increaseCounter(counter);
                    break;
                case 2:
                    counterLogic.decreaseCounter(counter);
                    break;
                case 3:
                    counter.printCounter();
                    break;
                case 4:
                    System.exit(1);
            }

        }

    }

}
