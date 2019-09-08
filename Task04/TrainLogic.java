package Task04;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class TrainLogic {

    public Train[] setTrainGroup(Train trainGroup[]) {

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < trainGroup.length; i++) {

            System.out.println("Enter Departure Name");
            String x = sc.next();

            System.out.println("Enter Train Number");
            while (sc.hasNextInt() == false) {
                sc.next();
                System.out.println("Enter Train Number");
            }
            int y = sc.nextInt();

            GregorianCalendar date = new GregorianCalendar();

            System.out.println("Enter departure Year");
            while (sc.hasNextInt() == false) {
                sc.next();
                System.out.println("Enter departure Year");
            }
            int year = sc.nextInt();

            System.out.println("Enter departure Month");
            while (sc.hasNextInt() == false) {
                sc.next();
                System.out.println("Enter departure Month");
            }
            int month = sc.nextInt();

            System.out.println("Enter departure day of month");
            while (sc.hasNextInt() == false) {
                sc.next();
                System.out.println("Enter departure day of month");
            }
            int day = sc.nextInt();

            System.out.println("Enter departure hour");
            while (sc.hasNextInt() == false) {
                sc.next();
                System.out.println("Enter departure hour");
            }
            int hour = sc.nextInt();

            System.out.println("Enter departure minutes");
            while (sc.hasNextInt() == false) {
                sc.next();
                System.out.println("Enter departure minutes");
            }
            int minutes = sc.nextInt();

            System.out.println("Enter departure seconds");
            while (sc.hasNextInt() == false) {
                sc.next();
                System.out.println("Enter departure seconds");
            }
            int seconds = sc.nextInt();

            date.set(Calendar.YEAR, year);
            date.set(Calendar.MONTH, month);
            date.set(Calendar.DAY_OF_MONTH, day);
            date.set(Calendar.HOUR_OF_DAY, hour);
            date.set(Calendar.MINUTE, minutes);
            date.set(Calendar.SECOND, seconds);

            trainGroup[i] = new Train(x, y, date);

        }
        return trainGroup;
    }

    public void getTrainInformationByTrainNum(Train[] trainGroup) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Train Number to get information about it");
        while (sc.hasNextInt() == false) {
            sc.next();
            System.out.println("Enter Train Number to get information about it");
        }
        int trainNum = sc.nextInt();

        for (int i = 0; i < trainGroup.length; i++) {
            if (trainGroup[i].getTrainNumber() == trainNum) {
                trainGroup[i].printTrain();
            }
        }
    }

    public void printTrainGroup(Train[] trainGroup) {
        for (int i = 0; i < trainGroup.length; i++) {
            trainGroup[i].printTrain();
        }
    }

}
