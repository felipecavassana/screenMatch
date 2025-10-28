package Study.model;

public class People {
    private String name;
    private int age;

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

    public void sayHello(){
        System.out.println("Hello World, my name is "+ this.name);
    }

    public void isMajor(){
        if (age >= 18) {
            System.out.println(name + " é maior de idade.");
        } else {
            System.out.println(name + " não é maior de idade.");
        }
    }

    @Override
    public String toString() {
        return this.getName() +" ("+this.getAge()+")";
    }
}
