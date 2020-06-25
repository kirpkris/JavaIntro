package com.company.exceptions;

public class ExceptionsMain {

    public static void main(String[] args) {

          Dishwasher dishwasher = new Dishwasher(5);

        // stop not running dishwasher
        dishwasher.stopDishwasher();

        // run empty dishwasher
        dishwasher.runDishwasher();

        // fill dishwasher to full capacity
        int capacity = dishwasher.getMaxLoad();
        for (int i = 0; i < capacity; i ++) {
            dishwasher.loadItem();
        }

        // load another item exceeding capacity
         dishwasher.loadItem();

        // run dishwasher and check state
        dishwasher.runDishwasher();
        System.out.println(dishwasher.getDishwasherState());

        // unload items while dishwasher is running
        dishwasher.unloadItems();

        // stop dishwasher
        dishwasher.stopDishwasher();
        System.out.println(dishwasher.getDishwasherState());

        // unload items when washing is finished
        dishwasher.unloadItems();
        System.out.println(dishwasher.getItems());
        System.out.println(dishwasher.getDishwasherState());

    }

}
