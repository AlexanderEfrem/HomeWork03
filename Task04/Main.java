package Task04;

public class Main {


    public static void main(String... args) {

        Train[] trainGroup = new Train[3];
        TrainSorting sorting = new TrainSorting();
        TrainLogic groupTrainLogic = new TrainLogic();

        groupTrainLogic.setTrainGroup(trainGroup);

        groupTrainLogic.printTrainGroup(trainGroup);

        System.out.println("--------------------sort by number-------------------------");

        sorting.sortTrainGroupByNumber(trainGroup);
        groupTrainLogic.printTrainGroup(trainGroup);

        System.out.println("------------------sorting by name and time-----------------------");
        sorting.sortTrainByNameAndTime(trainGroup);
        groupTrainLogic.printTrainGroup(trainGroup);

        System.out.println("---------------------------------------------");
        groupTrainLogic.getTrainInformationByTrainNum(trainGroup);

    }
}

