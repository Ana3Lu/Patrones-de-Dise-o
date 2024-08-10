package punto4;

public class UndoCommand implements Command {
    
    private TaskManager taskManager;
    
    public UndoCommand() {
        this.taskManager = new TaskManager();  
    }

    public void execute(CommandHistory commandHistory) {
        taskManager.undo(commandHistory);
    }

    public void undo() {
        // Undo the last command
    }
}
