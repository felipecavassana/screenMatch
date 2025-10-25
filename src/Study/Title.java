package Study;

public class Title implements Comparable<Title>{
    private String name;

    public Title(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Title title) {
        return this.name.compareTo(title.name);
    }

    @Override
    public String toString() {
        return this.name;
    }
}
