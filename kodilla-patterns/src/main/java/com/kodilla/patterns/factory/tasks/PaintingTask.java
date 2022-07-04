package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task {
    String taskName;
    String color;
    String whatToPaint;
    boolean executed;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public String executeTask(){
        executed = true;
        return "Paint " + whatToPaint + " using " + color;
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
