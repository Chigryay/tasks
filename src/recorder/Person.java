package recorder;

public record Person(String name, Integer age) {
    public Person(String name) {
        this(name, 21);
    }
}
