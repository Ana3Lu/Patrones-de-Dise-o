package punto4;

public class DeleteTaskCommand implements Command {
    
    private TaskManager taskManager;
    private String taskName;
    
    public DeleteTaskCommand(TaskManager taskManager, String taskName) {
        this.taskManager = taskManager;
        this.taskName = taskName;
    }

    public String getTaskName() {
        return taskName;
    }
    
    @Override
    public void execute() {
        taskManager.deleteTask(taskName);
    }
    
    @Override
    public void undo() {
        taskManager.createTask(taskName);
    }
}
