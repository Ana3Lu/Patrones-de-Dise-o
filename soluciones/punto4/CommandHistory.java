package punto4;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CommandHistory {
    
    private ArrayList<Command> history;

    public CommandHistory() {
        this.history = new ArrayList<Command>();
    }

    public void addCommand(Command command) {
        history.add(command);
    }

    public Command getLastCommand() {
        if (history.isEmpty()) {
            return null;
        }
        return history.get(history.size() - 1);
    }

    public void removeLastCommand() {
        if (!history.isEmpty()) {
            history.remove(history.size() - 1);
        }
    }

    public boolean isEmpty() {
        return history.isEmpty();
    }
}
