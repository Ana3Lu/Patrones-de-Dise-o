package punto4;

import java.util.ArrayList;

public class CommandHistory {
    
    private ArrayList<Command> history;

    public CommandHistory() {
        this.history = new ArrayList<Command>();
    }

    public ArrayList<Command> getHistory() {
        return history;
    }

    public void addCommand(Command command) {
        history.add(command);
        System.out.println("Command added to history.");
    }

    public void removeLastCommand() {
        if (!history.isEmpty()) {
            history.remove(history.size() - 1);
            System.out.println("Command removed from history.");
        }
    }

    public void undoLastCommand() {
        if (!history.isEmpty()) {
            Command lastCommand = history.get(history.size() - 1);
            lastCommand.undo();
            history.remove(history.size() - 1);
            System.out.println("Undo executed where last command was.");
        }
    }

    public boolean isEmpty() {
        return history.isEmpty();
    }
}
