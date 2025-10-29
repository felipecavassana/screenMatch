package Study.model;

public class Title implements Comparable<Title>{
    private String name;
    private int yearReleased;
    private String director;

    public Title(String name) {
        this.name = name;
    }

    public Title(String name, int year, String director) {
        this.name = name;
        this.yearReleased = year;
        this.director = director;
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
