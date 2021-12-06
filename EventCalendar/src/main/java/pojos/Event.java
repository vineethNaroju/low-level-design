package pojos;

public class Event {

    private final String name;
    private final TimeSlot timeSlot;

    Event(String name, TimeSlot timeSlot) {
        this.name = name;
        this.timeSlot = timeSlot;
    }

    public String getName() {
        return name;
    }

    public TimeSlot getTimeSlot() {
        return timeSlot;
    }
}
