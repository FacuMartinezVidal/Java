public class Dog extends Animals {
    private String earShape;
    private String tailShape;

    public Dog(){
        //super() calls constructor defaults o no argument's animals
        super("Mutt", "Big", 50);
    }

//    public Dog(String type, double weight) {
//        this(type, weight, "Perky", "Curled");
//    }
    public Dog(String type, String size, double weight, String earShape, String tailShape) {
        super(type, weight < 15 ? "small" : (weight <35  ? "medium" : "large"), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    //here we are anulating makeNoise method of the superclass
    public void makeNoise(){

    }

    //when we see override in our code, means that we are adding some code plus the code of the father method
    @Override
    public void move(String speed) {
        super.move(speed);
        System.out.println("Dogs walk, run and wag their tails");
    }
}
