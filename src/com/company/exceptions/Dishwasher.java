package com.company.exceptions;

public class Dishwasher {

    private int items;
    private int maxLoad;
    private State dishwasherState;

    public Dishwasher(int maxLoad) {
        if (maxLoad == 0 || maxLoad < 0) {
            throw new IllegalArgumentException("Invalid maximum dishwasher load");
        }
        this.maxLoad = maxLoad;
        dishwasherState = State.ON;
    }

    public int getMaxLoad() {
        return maxLoad;
    }

    public int getItems() {
        return items;
    }

    public State getDishwasherState() {
        return dishwasherState;
    }


    /**
     * This method runs dishwasher
     *
     * @throws IllegalArgumentException if items = 0 or more than maxLoad
     * @throws InvalidStateException if dishwasherState is not ON
     */
    public void runDishwasher() {
        if (items > maxLoad) {
            throw new IllegalArgumentException("The number of loaded items exceeds capacity");
        } else if (items == 0) {
            throw new IllegalArgumentException("The dishwasher is empty");
        } else if (dishwasherState != State.ON) {
            throw new InvalidStateException("Please, stop/unload the dishwasher first");
        }
        dishwasherState = State.RUNNING;
        System.out.println("The dishwasher is running");
    }

    /**
     * This method stops dishwasher
     *
     * @throws InvalidStateException if dishwasherState is not RUNNING
     */
    public void stopDishwasher() {
        if (dishwasherState != State.RUNNING) {
            throw new InvalidStateException("The dishwasher is not running");
        }
        dishwasherState = State.UNLOADING;
        System.out.println("The dishwasher is stopped");
    }

    /**
     * This method loads dishwasher item
     *
     * @throws IllegalArgumentException if items = maxLoad
     * @throws InvalidStateException if dishwasherState is not ON
     */
    public void loadItem() {
        if (items == maxLoad) {
            throw new IllegalArgumentException("The dishwasher is full");
        } else if (dishwasherState != State.ON) {
            throw new InvalidStateException("You cannot load dishes while the dishwasher is running/unloading");
        }
        items++;
    }

    /**
     * This method unload dishwasher items
     *
     * @throws InvalidStateException if dishwasherState is not UNLOADING
     */
    public void unloadItems() {
        if (dishwasherState == State.ON) {
            throw new InvalidStateException("The washing cycle hasn't been run yet");
        } else if (dishwasherState == State.RUNNING) {
            throw new InvalidStateException("Please wait until washing cycle is finished");
        }
        items = 0;
        dishwasherState = State.ON;
        System.out.println("The dishwasher is ready to go");
    }

}
