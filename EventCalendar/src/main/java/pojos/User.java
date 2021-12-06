package pojos;

import java.util.Optional;
import java.util.TreeSet;

public class User extends Participant{
    private final TimeSlot workingHours;
    private Optional<Team> team;
    private TreeSet<Event> events;

    User(String name, TimeSlot workingHours) {
        super(name);
        this.workingHours = workingHours;
        this.events = new TreeSet<>();
    }

    public Optional<Team> getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = Optional.of(team);
    }

    public TreeSet<Event> getEvents() {
        return events;
    }

    public void addEvent(Event event) {
        this.events.add(event);
    }
}
