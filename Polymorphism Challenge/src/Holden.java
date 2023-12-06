public class Holden extends Car {

    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Holden - > start engine";
    }

    @Override
    public String accelerate() {
        return "Holden - > accelerate";
    }

    @Override
    public String brake() {
        return "Holden - > brake";
    }
}
