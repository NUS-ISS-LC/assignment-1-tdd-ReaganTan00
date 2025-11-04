package sg.edu.nus.iss.epat.tdd.workshop;
import java.util.Collection;
import java.util.HashMap;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


import static org.junit.Assert.fail;

public class ToDoListTest  {
    // Define Test Fixtures
    public Task t1;
    public Task completed_t;

    public ToDoListTest() {
        super();
    }

    @Before
    public void setUp() throws Exception {
        // Initialise Test Fixtures
        t1 = new Task("Description");
        completed_t = new Task("Completed Task");
        completed_t.setComplete(true);
    }

    @After
    public void tearDown() throws Exception {
        // Uninitialise test Fixtures
    }

    @Test
    public void testAddTask() {
        ToDoList tdl = new ToDoList();
        tdl.addTask(t1);

        Collection<Task> checker = tdl.tasks.values();
        assertNotNull(checker);

        Task item = tdl.tasks.get(t1.getDescription());
        assertEquals(item, t1);
    }

    @Test
    public void testGetStatus() {
        ToDoList tdl = new ToDoList();
        tdl.addTask(t1);

        boolean status = tdl.getStatus(t1.getDescription());
        assertNotNull(status);
        assertEquals(status, t1.isComplete());
    }

    @Test
    public void testRemoveTask() {
        ToDoList tdl = new ToDoList();
        tdl.addTask(t1);

        Task removed = tdl.removeTask(t1.getDescription());
        assertNotNull(removed);
        assertEquals(removed, t1);
    }

    @Test
    public void testGetCompletedTasks() {
        ToDoList tdl = new ToDoList();
        tdl.addTask(completed_t);
        Collection<Task> completed_tasks = tdl.getCompletedTasks();
        assertNotNull(completed_tasks);

        tdl.addTask(t1);
        assertEquals(tdl.getCompletedTasks(), completed_tasks);
    }
}