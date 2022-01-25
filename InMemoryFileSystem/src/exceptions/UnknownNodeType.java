package exceptions;

import pojos.NodeType;

public class UnknownNodeType extends  RuntimeException {
    public UnknownNodeType(NodeType type) {
        super("Un-implemented node type creation : " + type);
    }
}
