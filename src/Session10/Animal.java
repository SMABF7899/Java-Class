package Session10;

public class Animal {
    private String name;
    protected String color;
    protected char gender;
    protected String race;
    protected int age;

    public Animal (String name) {
        this.name = name;
    }

    public Animal (char gender, String color, int age, String race) {
        this.gender = gender;
        this.age = age;
        this.color = color;
        this.race = race;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String greet() {
        return "صدای حیوانات";
    }
}
