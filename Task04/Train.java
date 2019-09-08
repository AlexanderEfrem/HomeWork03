package Task04;

import java.util.GregorianCalendar;

public class Train {

    private String destinationName;
    private int trainNumber;
    private GregorianCalendar departureDate;

    public Train(String destinationName, int trainNumber, GregorianCalendar departureDate) {

        this.destinationName = destinationName;
        this.trainNumber = trainNumber;
        this.departureDate = departureDate;

    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public String getDestinationName() {
        return destinationName;
    }

    public GregorianCalendar getDepartureDate() {

        return departureDate;
    }

    public void printTrain() {
        System.out.println(destinationName + " " + trainNumber + " " + departureDate.getTime());
    }
}
