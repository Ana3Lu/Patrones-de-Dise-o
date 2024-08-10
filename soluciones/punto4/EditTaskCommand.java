package punto4;

public class EditTaskCommand implements Command {
    
    private TaskManager taskManager;
    private String newName;
    private String prevName;
    
    public EditTaskCommand(TaskManager taskManager, String newName, String prevName) {
        this.taskManager = taskManager;
        this.newName = newName;
        this.prevName = prevName;
    }

    public String getNewName() {
        return newName;
    }

    public String getPrevName() {
        return prevName;
    }
    
    @Override
    public void execute() {
        taskManager.editTask(prevName, newName);
    }

    @Override
    public void undo() {
        taskManager.editTask(newName, prevName);
    }
}
