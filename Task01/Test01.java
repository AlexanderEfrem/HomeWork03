package by.AlexanderEfremenko.htp.ClassesAndObjectives.Task01;

public class Test01 {

    private int peremennaya1;
    private int peremennaya2;

    public Test01() {
        peremennaya1 = 0;
        peremennaya2 = 0;
    }

    public Test01(int x, int y) {
        peremennaya1 = x;
        peremennaya2 = y;
    }

    public  void setValues (int _peremennaya1, int _peremennaya2) {
        peremennaya1 = _peremennaya1;
        peremennaya2 = _peremennaya2;
    }

    public void PrintTest01 () {
        System.out.println("Peremennaya = " + peremennaya1 + "\nPeremennaya2 = " + peremennaya2);
    }

    public int sum () {
        int sum;

        sum = peremennaya1 + peremennaya2;
        return sum;

    }

    public int findMax () {
        int max;

        max = Math.max(peremennaya1, peremennaya2);
        return max;

    }

}
