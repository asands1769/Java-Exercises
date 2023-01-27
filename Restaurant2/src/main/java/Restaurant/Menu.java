package Restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {


    public static ArrayList<MenuItem> currentMenu = new ArrayList<>();
    private Date lastUpdated;

    public static void addMenuItem(String name, String description, Double price, String category){
        MenuItem newItem = new MenuItem(name, description, price, category);
        for(MenuItem items: currentMenu){
            if(items.equals(newItem)){
                System.out.println("That item is already on the Menu!  Please enter a new item.");
                return;
            }
        }
        currentMenu.add(newItem);
    }
    public static void removeMenuItem(String nameToBeRemoved){
        for (MenuItem item: currentMenu) {
            if(item.getName().toLowerCase().contains(nameToBeRemoved.toLowerCase())){
                currentMenu.remove(item);
                break;
            }
        }
    }

    public static void printMenu(){
        for (Object items: currentMenu) {
            System.out.println(items.toString());
        }
    }
    public static void printMenuItem(String menuItem){
        for(MenuItem items: currentMenu){
            if(items.getName().toLowerCase().contains(menuItem.toLowerCase())){
                System.out.print(items.toString());
            }
        }
    }
    public static boolean areTwoItemsEqual(MenuItem item1, MenuItem item2){
       return item1.equals(item2);
    }


}
