package punto4;

public class CreateTaskCommand implements Command {
    
    private TaskManager taskManager;
    private String taskName;
    
    public CreateTaskCommand(TaskManager taskManager, String taskName) {
        this.taskManager = taskManager;
        this.taskName = taskName;
    }

    public String getTaskName() {
        return taskName;
    }
    
    @Override
    public void execute() {
        taskManager.createTask(taskName);
    }

    @Override
    public void undo() {
        taskManager.deleteTask(taskName);
    }
}
