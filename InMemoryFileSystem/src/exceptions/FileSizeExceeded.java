package exceptions;

public class FileSizeExceeded extends RuntimeException {

    public FileSizeExceeded(String fileName, Integer charsLeft) {
        super("FileSizeExceeded for file with name :" + fileName + " and chars left :" + charsLeft);
    }
}
