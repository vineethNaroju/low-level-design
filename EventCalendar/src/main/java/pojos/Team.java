package pojos;

import java.util.LinkedList;
import java.util.List;

public class Team extends Participant {
    private final List<User> members;

    public Team(String name) {
        super(name);
        this.members = new LinkedList<>();
    }

    public void addUser(User user) {
        members.add(user);
    }
}
