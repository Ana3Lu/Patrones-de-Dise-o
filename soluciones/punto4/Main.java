package punto4;

public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        User user = new User();

        System.out.println("User operations:\n");
        user.setCommand(new CreateTaskCommand(taskManager, "Task 1"));
        user.executeCommand();
        user.setCommand(new CompleteTaskCommand(taskManager, "Task 1"));
        user.executeCommand();
        user.setCommand(new EditTaskCommand(taskManager, "Task 2", "Task 1"));
        user.executeCommand();
        user.setCommand(new DeleteTaskCommand(taskManager, "Task 2"));
        user.executeCommand();

        System.out.println("\nUndo operations:\n");
        user.undoLastCommand();
        user.undoLastCommand();
        user.undoLastCommand();
        user.undoLastCommand();
    }
}
