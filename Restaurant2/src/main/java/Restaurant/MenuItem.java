package Restaurant;

import java.util.Date;

public class MenuItem {

    private String name;
    private String description;
    private double price;
    private String category;
    private Date dateAdded;

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }



    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public Date getDateAdded() {
        return dateAdded;
    }
    @Override
    public boolean equals(Object toBeCompared){
        if (toBeCompared == this){
            return true;
        }
        if(toBeCompared == null){
            return false;
        }
        if (toBeCompared.getClass() != getClass()){
            return false;
        }
        MenuItem menuItem = (MenuItem) toBeCompared;
        if(menuItem.getName() != getName() || menuItem.getCategory() != getCategory() || menuItem.getDescription() != getDescription() || menuItem.getPrice() != getPrice()){
            return false;
        }
        else{
            return true;
        }
    }

    @Override
    public String toString(){
        return  "************\n" + "Name: " + getName() + "\n" +
                "Description: " + this.getDescription() + "\n" +
                "Category: " + this.getCategory() + "\n" +
                "Price: " + this.getPrice() + "\n";
    }

    public MenuItem(String name, String description, double price, String category){
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.dateAdded = new Date();
    }
}
