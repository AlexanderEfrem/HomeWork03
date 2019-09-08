package Task03;

public class Student {

    private String lastNameAndInitials;
    private int groupNumber;
    private int[] performance;

    public Student(String _lastNameAndInitials, int _groupNumber, int[] _performance) {

        lastNameAndInitials = _lastNameAndInitials;
        groupNumber = _groupNumber;
        performance = _performance;

    }

    public void printBestStudent() {

        int counter = 0;

        for (int i = 0; i < performance.length; i++) {
            if (performance[i] >= 9) {
                ++counter;
            } else {
                break;
            }
        }
        if (counter == performance.length) {
            System.out.println(lastNameAndInitials + " " + groupNumber);
        }
    }
}

