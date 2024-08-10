package punto4;

public class User {

    private Command command;
    private CommandHistory commandHistory;
    private UndoCommand undoCommand;

    public User() {
        this.command = null;
        this.commandHistory = new CommandHistory();
        this.undoCommand = new UndoCommand();
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public Command getCommand() {
        return command;
    }

    public CommandHistory getCommandHistory() {
        return commandHistory;
    }

    public void executeCommand() {
        command.execute();
        commandHistory.addCommand(command);
    }

    public void undoLastCommand() {
        undoCommand.execute(commandHistory);
    }
}
