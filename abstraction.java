abstract class Car {

    public abstract void drive(); // declaring abstract method meaning it has no body

    public void playmusic() {
        System.out.println("music is playing"); // concrete method with body
    }
}

class Toyota extends Car {

    @Override
    public void drive() {
        System.out.println("Toyota is driving"); // providing body to abstract method
    }

    public void playmusic() {
        System.out.println("music is playing in Toyota");
    }
}

public class App {
    public static void main(String[] args) {
        Car car = new Toyota();
        car.drive();
        car.playmusic();

    }
}
