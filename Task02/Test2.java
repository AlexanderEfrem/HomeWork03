package by.AlexanderEfremenko.htp.ClassesAndObjectives.Task02;

public class Test2 {

    private int peremennaya1;
    private int peremennaya2;

    public Test2() {
        peremennaya1 = 0;
        peremennaya2 = 0;
    }

    public Test2(int x, int y) {
        peremennaya1 = x;
        peremennaya2 = y;
    }

    public  void setValues (int _peremennaya1, int _peremennaya2) {
        peremennaya1 = _peremennaya1;
        peremennaya2 = _peremennaya2;
    }

    public void printTest02 () {
        System.out.println("Peremennaya = " + peremennaya1 + "\nPeremennaya2 = " + peremennaya2);
    }

    public int getPeremennaya1() {
        return peremennaya1;
    }

    public int getPeremennaya2() {
       return peremennaya2;
    }

}
