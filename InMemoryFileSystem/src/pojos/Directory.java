package pojos;

import exceptions.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Directory extends Node {

    private final Map<String, Node> nodeMap;
    private final Integer MAX_FILE_COUNT = 1000;

    public Directory(String name) {
        super(NodeType.Directory, name);
        nodeMap = new HashMap<>();
    }

    public String toString() {
        return "Directory[" + name + "]";
    }

    public Directory createIfNotFoundAndGetDirectory (String name) {
        Directory res = null;

        if(nodeMap.containsKey(name)) {
            if(nodeMap.get(name).isDirectory()) {
                res = (Directory) nodeMap.get(name);
            } else {
                throw new FileExistsDuplicateName(name);
            }
        } else {
            res = new Directory(name);
            nodeMap.put(name, res);
        }

        return res;
    }

    public void createNode (String name, NodeType type) {

        if(nodeMap.containsKey(name)) {
            throw new DuplicateNameInDirectory(name, type);
        }

        switch (type) {
            case File: {
                nodeMap.put(name, new File(name));
                break;
            }

            case Directory: {
                nodeMap.put(name, new Directory(name));
                break;
            }

            default: {
                throw new UnknownNodeType(type);
            }
        }
    }

    public Directory getDirectory(String name) {
        if(nodeMap.containsKey(name)) {
            if(nodeMap.get(name).isDirectory()) {
                return (Directory) nodeMap.get(name);
            }
        }

        throw new DirectoryNotFound(name);
    }

    public void printContents() {
        Set<String> names = nodeMap.keySet();

        System.out.println("<-----" + this + "------>");

        for(String name : names) {
            System.out.println(nodeMap.get(name));
        }

    }

    public File getFile(String name) {
        if(nodeMap.containsKey(name)) {
            if(nodeMap.get(name).isFile()) {
                return (File) nodeMap.get(name);
            }
        }

        throw new FileNotFound(name);
    }

}
