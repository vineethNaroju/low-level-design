package exceptions;

public class FileNotFound extends RuntimeException {
    public FileNotFound(String fileName) {
        super("File not found with name : " + fileName);
    }
}
