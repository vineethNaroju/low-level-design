public class Client {

    public static void main(String[] args) {
        FileSystem fs = new FileSystem();

        fs.createFile("/hello.txt");
        fs.createDirectory("/usr/bin");
        fs.listDirectory("/");
        fs.createFile("/usr/bin/meow.ps");
        fs.listDirectory("/usr/bin");

        fs.appendDataToFile("/hello.txt", "Hello World !");

        fs.printFileContents("/hello.txt");
    }
}
