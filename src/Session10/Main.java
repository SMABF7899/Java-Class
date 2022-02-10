package Session10;

public class Main {
    public static void main(String[] args) {
//        Animal animal = new Animal();
//        Dog dog = new Dog("High");
//        Cat cat = new Cat();
//        cat.gender = 'f';
//        System.out.println(dog.gender);
//        animal.gender = 'f';
//        System.out.println(dog.getGender());

        Dog dog = new Dog("belief");
        dog.setName("Pop");
        System.out.println(dog.getName());
        Cat cat = new Cat("car");

        Shark shark = new Shark("Banu");
        //System.out.println(shark.getName());

        //dog.greet();
        //shark.greet();
        //cat.greet();

        Animal animal = new Cat("ffff");
        animal.greet();
        printInfo(dog);
        printInfo(cat);
        createAnimal(true);

    }

    public static void printInfo(Animal animal) {
        System.out.println("the name is " + animal.getName() + " and voice is " + animal.greet());
    }

    public static Animal createAnimal (boolean isDog) {
        if(isDog)
            return new Dog("dag a");
        else
            return new Cat("cat a");
    }

    public static Object createObject(boolean isDog) {
        if(isDog)
            return new Animal("a animal");
        else
            return new Fish();
    }
}
