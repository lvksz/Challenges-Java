public class DeluxeBurger extends Burger{

    Item deluxeOne;
    Item deluxeTwo;

    public DeluxeBurger(String name, double price) {
        super(name, price);
    }

    public void addToppings(String extraOne, String extraTwo, String extraThree,
                            String extraFour, String extraFive) {
        super.addToppings(extraOne, extraTwo, extraThree);
        deluxeOne = new Item("TOPPING", extraFour, 0);
        deluxeTwo = new Item("TOPPING", extraFive, 0);
    }

    @Override
    public void printItemizedList() {
        super.printItemizedList();
        if (deluxeOne != null){
            deluxeOne.printItem();
        }
        if (deluxeTwo != null){
            deluxeTwo.printItem();
        }
    }

    @Override
    public double getExtraPrice(String toppingName) {
        return 0;
    }
}
