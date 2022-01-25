import pojos.Directory;
import pojos.File;
import pojos.NodeType;


public class FileSystem {

    private final Directory ROOT_DIRECTORY = new Directory("root");
    private static final Helper helper = new Helper();

    public void listDirectory(String path) {
        String[] chunks = helper.chunkPath(path);
        Directory currentDir = ROOT_DIRECTORY;

        for (int i=1; i<chunks.length; ++i) {
            currentDir = currentDir.getDirectory(chunks[i]);
        }

        currentDir.printContents();
    }


    public void createFile(String path) {
        String[] chunks = helper.chunkPath(path);

        Directory currentDir = ROOT_DIRECTORY;
        String fileName = "none";

        for (int i=1; i<chunks.length; ++i) {
            System.out.println(chunks[i]);
            if(i == chunks.length - 1) {
                fileName = chunks[i];
            } else {
                currentDir = currentDir.createIfNotFoundAndGetDirectory(chunks[i]);
            }
        }

        currentDir.createNode(fileName, NodeType.File);
    }

    public void createDirectory(String path) {
        String[] chunks = helper.chunkPath(path);

        Directory currentDir = ROOT_DIRECTORY;

        for (int i=1; i<chunks.length; ++i) {
            currentDir = currentDir.createIfNotFoundAndGetDirectory(chunks[i]);
        }

    }

    public void appendDataToFile (String path, String data) {
        String[] chunks = helper.chunkPath(path);
        Directory currentDir = ROOT_DIRECTORY;

        for(int i=1; i<chunks.length; ++i) {
            if(i == chunks.length - 1) {
                currentDir.getFile(chunks[i]).append(data);
            } else {
                currentDir = currentDir.getDirectory(chunks[i]);
            }
        }
    }

    public void printFileContents (String path) {
        String[] chunks = helper.chunkPath(path);
        Directory currentDir = ROOT_DIRECTORY;

        for(int i=1; i<chunks.length; ++i) {
            if(i == chunks.length - 1) {
                currentDir.getFile(chunks[i]).printContents();
            } else {
                currentDir = currentDir.getDirectory(chunks[i]);
            }
        }
    }

}
