package exceptions;

public class FileExistsDuplicateName extends RuntimeException {

    public FileExistsDuplicateName(String fileName) {
        super("File exists with duplicate name : " + fileName);
    }
}
