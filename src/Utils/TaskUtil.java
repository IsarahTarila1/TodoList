package Utils;

import Models.Tasks;

import java.util.LinkedList;

public class TaskUtil {
    private LinkedList<Tasks>tasks = new LinkedList<>();

    //add task from user
    public void addTask(Tasks task){
        tasks.add(task);
    }
    //remove task from user
    public void removeTask(Tasks task) {
        tasks.add(task);
    }

    //display task
    public void displayTask(){
        for (Tasks task : tasks) {
            System.out.println("Description: "+ task.descriptionOfTask);
            System.out.println("Due date: "+ task.dueDate);
        }
    }
}
