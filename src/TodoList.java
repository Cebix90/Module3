import java.util.ArrayList;
import java.util.List;

public class TodoList {
    private final List<String> tasks;
    public TodoList() {
        tasks = new ArrayList<>();
    }

    public void add(String task){
        tasks.add(task);
    }

    public void print() {
        for (int i = 0; i < tasks.size(); i++){
            System.out.println("Task " + (i+1) + ": " + tasks.get(i));
        }
        System.out.println();
    }

    public void remove(int number){
        if(number < 1 || number > tasks.size()){
            System.out.println("Invalid task number to remove.");
        } else {
            tasks.remove(number-1);
        }
    }
}
