public class Room {
    private String code;
    private int seats;

    // Constructor
    public Room(String classCode, int numberOfSeats) {
        this.code = classCode;
        this.seats = numberOfSeats;
    }

    // Getter for code
    public String getCode() {
        return code;
    }

    // Getter for seats
    public int getSeats() {
        return seats;
    }
}
