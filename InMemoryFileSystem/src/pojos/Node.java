package pojos;

public class Node {

    private final NodeType type;
    protected final String name;

    public Node(NodeType type, String name) {
        this.type = type;
        this.name = name;
    }

    public Boolean isFile() {
        return  type == NodeType.File;
    }

    public Boolean isDirectory() {
        return type == NodeType.Directory;
    }

}
