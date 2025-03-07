
public class DecreasingCounter {

    private int value;  // an object variable for storing the value of the counter
    private int initialValue;

    public DecreasingCounter(int initialValue) {

        this.value = initialValue;
        this.initialValue = initialValue;
    }

    public void printValue() {
        // Do not change this code!
        System.out.println("value: " + this.value);
    }

    public void decrement() {
        if (value >0 ){
            value--;
            System.out.println("value: " + value);
        } else if (value <= 0) {
            System.out.println("value: " + 0);
        }

        // write the method implementation here// the aim is to decrement the value of the counter by one
    }
    public void reset (){
        this.value = 0;
    }
    // the other methods go here
}
