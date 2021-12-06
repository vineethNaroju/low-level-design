package pojos;

public abstract class Participant {
    private final String uniqueName;

    Participant(String name) {
        uniqueName = name;
    }

    public String getName() {
        return uniqueName;
    }
}
