import daos.IUserDao;
import daos.impl.UserDao;

public class Driver {
    public static void main(String[] args) throws RuntimeException {
        IUserDao userDao = new UserDao();


    }
}
