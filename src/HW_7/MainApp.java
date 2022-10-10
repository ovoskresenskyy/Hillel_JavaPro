package HW_7;

public class MainApp {

    public static void main(String[] args) {
        Dog dogBobik = new Dog("Bobik");
        dogBobik.run(150);
        dogBobik.swim(50);

        Dog dogOlly = new Dog("Olly");
        dogOlly.run(25);
        dogOlly.swim(5);

        Cat catBarsik = new Cat("Barsik");
        catBarsik.run(100);
        catBarsik.swim(10);

        Cat catMatilda = new Cat("Matilda");
        catMatilda.run(200);

        Animal horseIgogo = new Animal("Igogo");
        horseIgogo.run(1500);
        horseIgogo.swim(50);

        System.out.println("Animals sample total: " + Animal.getClassSampleCounter());
        System.out.println("Cats sample total: " + Cat.getClassSampleCounter());
        System.out.println("Dogs sample total: " + Dog.getClassSampleCounter());
    }
}
