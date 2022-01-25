package exceptions;

public class DirectoryNotFound extends  RuntimeException {
    public DirectoryNotFound(String name) {
        super("Directory not found with name : " + name);
    }
}
