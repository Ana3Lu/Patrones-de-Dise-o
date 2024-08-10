package punto4;

public class UndoManager {
    
    private CommandHistory commandHistory;
    
    public UndoManager() {
        this.commandHistory = new CommandHistory();
    }

    public void execute(Command command) {
        command.execute();
        commandHistory.addCommand(command);
    }

    public void undo() {
        Command lastCommand = commandHistory.getLastCommand();
        if (lastCommand != null) {
            lastCommand.undo();
            commandHistory.removeLastCommand();
        }
    }
}
