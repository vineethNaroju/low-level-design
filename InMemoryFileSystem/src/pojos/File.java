package pojos;

import exceptions.FileSizeExceeded;

import java.util.LinkedList;
import java.util.List;

public class File extends Node {

    private final Integer MAX_CONTENT_CHARS = 1000;
    private final List<String> content;
    private Integer currentContentSize = 0;

    public File(String name) {
        super(NodeType.File, name);
        content = new LinkedList<>();
    }

    public void append(String data) {
        if(currentContentSize + data.length() > MAX_CONTENT_CHARS) {
            throw new FileSizeExceeded(name, MAX_CONTENT_CHARS - currentContentSize);
        }

        currentContentSize += data.length();
        content.add(data);
    }

    public String toString() {
        return "File[" + name + "]";
    }

    public void printContents() {
        System.out.println("<------" + this + "----->");
        for(String txt : content) {
            System.out.println(txt);
        }
    }
}
