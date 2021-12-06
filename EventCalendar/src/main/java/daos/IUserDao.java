package daos;

import pojos.Event;
import pojos.Team;
import pojos.User;

public interface IUserDao {
    void saveUser(User user);
    User getUser(String name);
    void setTeam(User user, Team team);
    void addEvent(User user, Event event);
}
