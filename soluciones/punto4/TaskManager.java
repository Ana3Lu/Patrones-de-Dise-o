package punto4;

import java.util.HashMap;

public class TaskManager {
    private HashMap<String, Task> tasks;
    
    public TaskManager() {
        this.tasks = new HashMap<String, Task>();
    }

    public Task getTask(String name) {
        return tasks.get(name);
    }
    
    public void createTask(String name) {
        tasks.put(name, new Task(name));
        System.out.println("Task created: " + name);
    }

    public void editTask(String prevName, String newName) {
        Task task = tasks.get(prevName);
        tasks.remove(prevName);
        tasks.put(newName, task);
        System.out.println("Task edited: " + prevName + " to " + newName);
    }

    public void completeTask(String name) {
        tasks.get(name).setCompleted(true);
        System.out.println("Task completed: " + name);
    }
    
    public void uncompleteTask(String name) {
        tasks.get(name).setCompleted(false);
        System.out.println("Task uncompleted: " + name);
    }

    public void deleteTask(String name) {
        tasks.remove(name);
        System.out.println("Task deleted: " + name);
    }

    public void undo(CommandHistory commandHistory) {
        Command lastCommand = commandHistory.getLastCommand();
        if (lastCommand != null) {
            lastCommand.undo();
            commandHistory.removeLastCommand();
            System.out.println("Undo executed where last command was.");
        }
    }
}
