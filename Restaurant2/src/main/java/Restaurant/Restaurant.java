package Restaurant;

public class Restaurant {

    public static void main(String[] args){
        Menu.addMenuItem("Tacos", "tacos", 9.99, "Appetizers");
        Menu.addMenuItem("Tacos", "tacos", 9.99, "Appetizers");
        Menu.printMenu();
        Menu.addMenuItem("Wings", "Wings", 9.99, "Appetizers");
        Menu.printMenuItem("Wings");
        System.out.println(Menu.areTwoItemsEqual(Menu.currentMenu.get(0), Menu.currentMenu.get(1)));
        Menu.printMenu();
        Menu.removeMenuItem("wings");
        Menu.printMenu();
    }
}
