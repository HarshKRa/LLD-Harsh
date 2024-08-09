package main;

import items.LibraryItems;

public class Library {
    private LibraryItems[] items;

    public Library(LibraryItems[] items){
        this.items = items;
    }
    /*
    * Calculate the total value of the Library items
    * */

    public  double calculateTotalValue(){
        double totalValue = 0;

        for(LibraryItems item : items){
            // here library can be anything cd,book,dvd no side effect prent object is repaced by chil
            // Liskov's principle
            totalValue += item.getValue();
        }

        return  totalValue;
    }
}
