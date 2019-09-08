package Task05;

import java.util.Scanner;

public class CounterLogic {
    public void increaseCounter(Counter x) {
        if (x.getCounterValue() >= x.getCounterMax()) {
            System.out.println("Maximum reached");
        } else {
            x.setValue(x.getCounterValue() + 1);
        }
    }

    public void decreaseCounter(Counter x) {
        if (x.getCounterValue() <= x.getCounterMin()) {
            System.out.println("Minimum reached");
        } else {
            x.setValue(x.getCounterValue() - 1);
        }
    }

    public Counter setCounter () {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Counter's Max Value");
        while (sc.hasNextInt() == false) {
            sc.next();
            System.out.println("Enter Counter's Max Value");
        }
        int y = sc.nextInt();

        System.out.println("Enter Counter's Min Value");
        while (sc.hasNextInt() == false) {
            sc.next();
            System.out.println("Enter Counter's Min Value");
        }
        int x = sc.nextInt();

        System.out.println("Enter Counter Value");
        while (sc.hasNextInt() == false) {
            sc.next();
            System.out.println("Enter Counter Value");
        }
        int z = sc.nextInt();

        Counter newCounter = new Counter(x, y, z);

        return newCounter;
    }

}
