package Study;

import java.util.Collections;
import java.util.List;
import java.util.OptionalDouble;

public class Student {
    private String name;
    private int age;
    private List<Double> notes;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Double> getNotes() {
        return notes;
    }

    public void setNotes(List<Double> notes) {
        this.notes = notes;
    }

    public void getGradeAverage(){
        // Convert the List<Double> to a DoubleStream to use the average() method
        OptionalDouble average = this.notes.stream()
                .mapToDouble(Double::doubleValue)
                .average();

        // Handle the OptionalDouble result
        if (average.isPresent()) {
            System.out.println("The average is: " + average.getAsDouble());
        } else {
            System.out.println("The list is empty.");
        }
    }

    public void showInfo(){
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}
