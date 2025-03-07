
public class Statistics {
    private int count;
    private int sum;

    public Statistics() {
        this.count = 0;
        this.sum = 0;
    }

    public void addNumber(int number) {
        this.sum += number;
        this.count++;


    }

    public int getCount() {
        return this.count;
    }

    public int getSum() {
        return this.sum;
    }
    public double average(){
      return (double) this.sum/this.count;
    }

}
