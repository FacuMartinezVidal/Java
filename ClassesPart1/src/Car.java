public class Car {
    private String make;
    private String model;
    private String color;
    private int doors;
    private boolean convertible = true;

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setMake(String make) {
        if (make == null) make = "Unknown";
        String lowerCase = make.toLowerCase();
        switch (lowerCase){
            case "holden", "porsche", "tesla" -> this.make = make;
            default -> this.make = "Unsupported";
        }
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    //Constructors calling an overload constructor
    public Car(){
        //has to be the first line for calling in it
        this("Hyundai", "Genesis", "Black",4,false);
    }

    public Car(String make, String model, String color, int doors, boolean convertible){
        this.make = make;
        this.model = model;
        this.color = color;
        this.doors = doors;
        this.convertible = convertible;
        System.out.println("Object created");

    }

    public Car(String make, String model, String color) {
        this(make, model, color, 2,false);
        this.make = make;
        this.model = model;
        this.color = color;
    }

    public void describeCar(){
        System.out.println(doors + "-Door " + color + " " + make + " " + model + " " + (convertible? "Convertible" : ""));
        System.out.println();
    }
}
