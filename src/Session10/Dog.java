package Session10;

public class Dog extends Mammal {
    private String intelligence;
    public Dog (String name) {
        super(name);
    }

    public String greet() {
        return "صدای سگ";
    }

//    public Dog(String intelligence) {
//        this.intelligence = intelligence;
//        this.gender = 'm';
//    }

//    public char getGender() {
//        return gender;
//    }
}
