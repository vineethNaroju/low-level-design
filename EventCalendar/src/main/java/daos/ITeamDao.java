package daos;

import pojos.Team;
import pojos.User;

import java.util.List;

public interface ITeamDao {
    void saveTeam(Team team);
    List<User> getUsers();
}
