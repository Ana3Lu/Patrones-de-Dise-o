package punto4;

public class Task {
    private String name;
    private boolean  completed;

    public Task(String name) {
        this.name = name;
        this.completed = false;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public String getName() {
        return name;
    }

    public boolean isCompleted() {
        return completed;
    }

    public String toString() {
        return "Task: " + name + " - " + (completed ? "Completed" : "Not completed");
    }
}
