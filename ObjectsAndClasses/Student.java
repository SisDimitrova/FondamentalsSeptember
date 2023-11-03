package ObjectsAndClasses.Students_05;

public class Student {

    private String firstName;
    private String lastName;
    private int age;
    private String hometown;

    public Student (String firstName, String lastName, int age, String hometown) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.hometown = hometown;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    public String getHometown() {
        return this.hometown;
    }
    public String getDetails() {
        return String.format("%s %s is %d years old",
                this.firstName,
                this.lastName,
                this.age);
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }
}
