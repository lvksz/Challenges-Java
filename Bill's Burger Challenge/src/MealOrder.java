public class MealOrder {

    private Burger burger;
    private Item drink;
    private Item side;

    public MealOrder(){
        this("regular", "coke", "fries");
    }
    public MealOrder(String burgerType, String drinkType, String sideType){

        if (burgerType.equalsIgnoreCase("deluxe")){
            this.burger = new DeluxeBurger(burgerType, 8.5);
        }else {
            this.burger = new Burger(burgerType, 4.0);
            this.drink = new Item("drink", drinkType, 1.00);
            this.side = new Item("side", sideType, 1.50);
        }
    }

    public double getTotalPrice(){

        if (burger instanceof DeluxeBurger){
            return burger.getAdjustedPrice();
        }
        return side.getAdjustedPrice() + drink.getAdjustedPrice() + burger.getAdjustedPrice();
    }

    public void printItemizedList(){
        burger.printItem();

        if (burger instanceof DeluxeBurger){
            Item.printItem(drink.getName(), 0);
            Item.printItem(side.getName(), 0);
        }else {
            drink.printItem();
            side.printItem();
        }
        System.out.print("-".repeat(30));
        Item.printItem("TOTAL PRICE", getTotalPrice());
    }

    private void addBurgerToppings(String extraOne, String extraTwo, String extraThree){
        burger.addToppings(extraOne, extraTwo, extraThree);
    }

    private void addBurgerToppings(String extraOne, String extraTwo, String extraThree,
                                   String extraFour, String extraFive){
        if (burger instanceof DeluxeBurger db){
            db.addToppings(extraOne, extraTwo, extraThree, extraFour, extraFive);
        }else {
            burger.addToppings(extraOne, extraTwo, extraThree);
        }
    }

    public void setDrinkSize(String size){
        drink.setSize(size);
    }
}
