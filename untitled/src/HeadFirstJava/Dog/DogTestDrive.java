package HeadFirstJava.Dog;

public class DogTestDrive {
    public static void main(String[] args) {
        Dog one = new Dog();
        one.setSize(70);
        one.setName("Шарик");
        Dog two = new Dog();
        two.setSize(8);
        two.setName("Бобик");
        Dog three = new Dog();
        three.setSize(35);
        three.setName("Полкан");

        System.out.println(one.getName() + " " + one.getSize());
        one.bark(4);
        System.out.println(two.getName() + " " + two.getSize());
        two.bark(5);
        System.out.println(three.getName() + " " + three.getSize());
        three.bark(2);
    }
}
