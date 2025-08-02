package UsedCase;

import tasks.models.Task;

public class TaskUsedCase;{

    public String Create(String name, String description) {
        task task = new Task(name, description, false);
        return "Tarea creada: " + task.getName() + ", Description: " + task.getDescription() + ", Status: "
                + task.getStatus();
    }
//propiedad
Task Task;
    public void create() {

    }
    //constructor
    public TaskUsedCase(Task task) {
        this.Task = task;
    }

    // update
    public
    task.set
    }

    // read
    public String read(Task task) {
        return "Tarea: " + task.getName() + ", Description: " + task.getDescription() + ", Status: " + task.getStatus();
    }

    // delete
    public String delete(Task task) {
        task.setName(null);
        task.setDescription(null);
        task.setStatus(false);
        return "Tarea eliminada";
    }

    // get
    public String get(){}
    return "Tarea: " + Task.getName() + ", Description: " + Task.getDescription() + ", Status: " + Task.getStatus();
    }
}
