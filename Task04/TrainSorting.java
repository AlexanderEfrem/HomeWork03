package Task04;


public class TrainSorting {


    public Train[] sortTrainGroupByNumber(Train trainGroup[]) {

        boolean isSorted = false;
        while (isSorted == false) {
            isSorted = true;
            for (int i = 0; i < trainGroup.length - 1; i++) {
                Train current = trainGroup[i];
                Train next = trainGroup[i + 1];
                if (current.getTrainNumber() > next.getTrainNumber()) {
                    isSorted = false;
                    Train temp;
                    temp = trainGroup[i];
                    trainGroup[i] = trainGroup[i + 1];
                    trainGroup[i + 1] = temp;
                }
            }
        }
        return trainGroup;
    }

    public Train[] sortTrainByNameAndTime(Train trainGroup[]) {
        int minLength;
        boolean isSorted = false;
        while (isSorted == false) {
            isSorted = true;
            for (int i = 0; i < trainGroup.length - 1; i++) {
                Train current = trainGroup[i];
                Train next = trainGroup[i + 1];
                char currentTemp[] = current.getDestinationName().toCharArray();
                char nextTemp[] = next.getDestinationName().toCharArray();
                if (currentTemp.length > nextTemp.length) {
                    minLength = nextTemp.length;
                } else {
                    minLength = currentTemp.length;
                }

                for (int j = 0; j < minLength; j++) {
                    if (currentTemp[j] > nextTemp[j]) {
                        isSorted = false;
                        Train temp;
                        temp = trainGroup[i];
                        trainGroup[i] = trainGroup[i + 1];
                        trainGroup[i + 1] = temp;
                        break;
                    } else if (currentTemp[j] < nextTemp[j]) {
                        break;
                    }
                }
                if (current.getDestinationName().equals(next.getDestinationName()) == true) {
                    if (current.getDepartureDate().after(next.getDepartureDate()) == true) {
                        Train temp;
                        temp = trainGroup[i];
                        trainGroup[i] = trainGroup[i + 1];
                        trainGroup[i + 1] = temp;
                    }

                }
            }
        }
        return trainGroup;
    }

}
