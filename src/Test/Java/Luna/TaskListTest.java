package Luna;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskListTest {
    @Test
    public void addTaskListTest(){
        TaskList tl = new TaskList();
        assertEquals(tl.getSize(), 0);
        tl.add(new ListEntryTodo("Item 1", false));

        assertEquals(tl.getSize(), 1);

        tl.add(new ListEntryTodo("Item 2", false));
        tl.add(new ListEntryTodo("Item 3", false));
        tl.add(new ListEntryTodo("Item 4", false));
        assertEquals(tl.getSize(), 4);

    }

    @Test
    public void markAndUnmarkTest(){
        TaskList tl = new TaskList();

        assertEquals(tl.getSize(), 0);
        tl.add(new ListEntryTodo("Item 1", false));
        tl.add(new ListEntryTodo("Item 2", false));
        assertEquals(tl.getSize(), 2);
        assertFalse(tl.getEntry(0).isDone);
        assertFalse(tl.getEntry(1).isDone);

        tl.getEntry(1).markEntry();


        assertFalse(tl.getEntry(0).isDone);
        assertTrue(tl.getEntry(1).isDone);
        tl.getEntry(0).unmarkEntry();

        assertFalse(tl.getEntry(0).isDone);
        assertTrue(tl.getEntry(1).isDone);

        tl.getEntry(1).unmarkEntry();

        assertFalse(tl.getEntry(0).isDone);
        assertFalse(tl.getEntry(1).isDone);


    }
}