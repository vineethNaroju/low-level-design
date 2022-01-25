package exceptions;

import pojos.NodeType;

public class DuplicateNameInDirectory extends  RuntimeException {
    public DuplicateNameInDirectory(String name, NodeType type) {
        super("Duplicate " + type + " exists with name : " + name);
    }
}
