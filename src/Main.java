public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Car car = new Car("Volkswagen");
        Car car2 = new Car("BMW");

        System.out.println(car.getName());

        car.setName("Audi");
        System.out.println(car.getName());
        System.out.println(car2.getName());
    }
}
