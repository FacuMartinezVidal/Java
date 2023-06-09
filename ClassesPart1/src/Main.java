public class Main {
    public static void main(String[] args) {
        //With default constructor
        //initialization
        Car car1 = new Car();
        //setting values to Car's fields
        car1.setMake("Porsche");
        car1.setColor("Grey");
        car1.setDoors(2);
        car1.setConvertible(true);
        car1.setModel("Carrera");
        //printing de objects
        car1.describeCar();

        //With a manual constructor
        Car car3 = new Car("Ferrari", "Enzo", "Red", 3, true);
        car3.describeCar();

        //With overload constructor
        Car car2 = new Car();
        car2.describeCar();

        //Whit parameters already established
        Car car4 = new Car("Toyota", "86", "Blue");
        car4.describeCar();

    }
}