import Models.Tasks;
import Utils.TaskUtil;

public class Main {
    public static void main(String[] args) {
        TaskUtil taskList = new TaskUtil();
        taskList.addTask(new Tasks("Revive the Flit Fm Android project","15 sep 2023"));
        taskList.addTask(new Tasks("Clear Errors", "16 sep 2023"));


        System.out.println("All tasks");
        taskList.displayTask();
    }
}