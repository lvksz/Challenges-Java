public class Burger extends Item {

    private Item extraOne;
    private Item extraTwo;
    private Item extraThree;

    public Burger(String name, double price) {
        super("Burger", name, price);
    }

    @Override
    public String getName() {
        return super.getName() + "BURGER";
    }

    @Override
    public double getAdjustedPrice() {
        return getBasePrice() +
                ((extraOne == null) ? 0 : extraOne.getAdjustedPrice()) +
                ((extraTwo == null) ? 0 : extraTwo.getAdjustedPrice()) +
                ((extraThree == null) ? 0 : extraThree.getAdjustedPrice());
    }

    public double getExtraPrice(String toppingName){

        return switch (toppingName.toUpperCase()){
            case "AVOCADO", "CHEESE" -> 1.0;
            case "BACON", "HAM", "SALAMI" -> 1.5;
            default -> 0.0;
        };
    }

    public void addToppings(String extraOne, String extraTwo, String extraThree){
        this.extraOne = new Item("TOPPING", extraOne, getExtraPrice(extraOne));
        this.extraTwo = new Item("TOPPING", extraTwo, getExtraPrice(extraTwo));
        this.extraThree = new Item("TOPPING", extraThree, getExtraPrice(extraThree));
    }

    public void printItemizedList(){
        printItem("BASE BURGER", getBasePrice());
        if (extraOne != null){
            extraOne.printItem();
        }
        if (extraTwo != null){
            extraTwo.printItem();
        }
        if (extraThree != null){
            extraThree.printItem();
        }
    }

    @Override
    public void printItem() {
        printItemizedList();
        System.out.println("-".repeat(30));
        super.printItem();
    }
}
