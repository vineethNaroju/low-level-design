package daos.impl;

import daos.IUserDao;
import pojos.Event;
import pojos.Team;
import pojos.User;

import java.util.HashMap;
import java.util.Map;

public class UserDao implements IUserDao {

    private final Map<String, User> userMap;

    public UserDao() {
        this.userMap = new HashMap<>();
    }

    @Override
    public void saveUser(User user) {
        if(userMap.containsKey(user.getName())) {
            throw new RuntimeException("User exists with name:" + user.getName());
        }
        userMap.put(user.getName(), user);
    }

    @Override
    public User getUser(String name) {
        if(!userMap.containsKey(name)) {
            throw new RuntimeException("User doesn't exist with name:" + name);
        }
        return userMap.get(name);
    }

    @Override
    public void setTeam(User user, Team team) {
        user.setTeam(team);
    }

    @Override
    public void addEvent(User user, Event event) {
        user.addEvent(event);
    }
}
