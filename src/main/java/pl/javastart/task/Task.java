package pl.javastart.task;

public class Task {
    String name;
    String describe;
    int piority;
    Person person;

    public Task(String name, String describe) {
        this.name = name;
        this.describe = describe;
    }

    public Task(String name, String describe, int piority) {
        this(name, describe);
        this.piority = piority;
    }

    public Task(String name, String describe, int piority, Person person) {
        this(name, describe, piority);
        this.person = person;
    }

    public boolean highPriority() {
        return piority > 0;
    }

    public boolean mediumPriority() {
        return piority == 0;
    }

    public boolean lowPriority() {
        return piority < 0;
    }
}
