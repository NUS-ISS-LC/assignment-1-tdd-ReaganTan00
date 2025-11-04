package sg.edu.nus.iss.epat.tdd.workshop;
import java.util.Collection;
import java.util.HashMap;
import java.util.ArrayList;

public class ToDoList {
   public HashMap<String, Task> tasks = new HashMap<String, Task>();

   public void addTask(Task task) {
      tasks.put(task.getDescription(), task);
      // Add code here
   }

   public void completeTask(String description) {
      // Add code here
   }

   public boolean getStatus(String description) {
      // Add code here
      return getTask(description).isComplete();
   }

   public Task getTask(String description) {
      // Add code here
      return tasks.get(description);
   }

   public Task removeTask(String description) {
      // Add code here
      Task res = tasks.remove(description);
      return res;
   }

   public Collection<Task> getAllTasks() {
      return tasks.values();
   }

   public Collection<Task> getCompletedTasks() {
      // Add code here
      Collection<Task> res = new ArrayList<>(); 

      for (Task task : tasks.values()) {
         if (task.isComplete()) {
            res.add(task);
         }
      }
      return res;
   }
}
