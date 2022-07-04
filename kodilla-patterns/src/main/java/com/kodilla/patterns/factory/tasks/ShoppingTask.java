package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task{
    String taskName;
    String whatToBuy;
    double quantity;
    boolean executed;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
   public String executeTask(){
        executed = true;
        return "Buy " + quantity + " of " + whatToBuy;
    };

    @Override
    public String getTaskName(){
        return taskName;
    }
    @Override
    public boolean isTaskExecuted (){
        return executed;
    }


}
