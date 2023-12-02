public class TodoList {
    private final String[] tasks;
    private int size;
    public TodoList() {
        tasks = new String[10];
        size = 0;
    }

    public void add(String task){
        if (size < tasks.length) {
            tasks[size++] = task;
        } else {
            System.out.println("TodoList is full. Cannot add more tasks.");
        }
    }

    public void print() {
        for (int i = 0; i < tasks.length; i++){
            if(tasks[i] != null)
                System.out.println("Task " + (i+1) + ": " + tasks[i]);
            else
                break;
        }
        System.out.println();
    }

    public void remove(int number){
        if (number >= 1 && number <= size) {
            for (int i = number - 1; i < size - 1; i++) {
                tasks[i] = tasks[i + 1];
            }
            tasks[size - 1] = null;
            size--;
        } else {
            System.out.println("Invalid task number to remove.");
        }
    }
}
