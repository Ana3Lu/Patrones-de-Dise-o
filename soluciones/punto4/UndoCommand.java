package punto4;

public class UndoCommand {
    
    private TaskManager taskManager;
    
    public UndoCommand() {
        this.taskManager = new TaskManager();  
    }

    public void execute(CommandHistory commandHistory) {
        taskManager.undo(commandHistory);
    }
}
