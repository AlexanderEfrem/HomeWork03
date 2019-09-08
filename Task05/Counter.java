package Task05;

public class Counter {
    private int min;
    private int max;
    private int value;

    public Counter() {
        this.min = 0;
        this.max = 100;
        this.value = 0;
    }

    public Counter(int min, int max, int value) {
        if (min > max) {
            min = max - 1;
        } else if (max < min) {
            max = min + 1;
        } else if (value > max || value < min) {
            value = max - 1;
        }
        this.min = min;
        this.max = max;
        this.value = value;
    }

    public int getCounterValue() {
        return value;
    }

    public int getCounterMin() {
        return min;
    }

    public int getCounterMax() {
        return max;
    }


    public void setValue(int value) {
        this.value = value;
    }

    public void printCounter() {
        System.out.println("Counter Value = " + this.value + " Counter Min Value =  " + this.min + " Counter Max Value = " + this.max);
    }

}
