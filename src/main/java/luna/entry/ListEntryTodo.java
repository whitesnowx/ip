package luna.entry;

/**
 * Represent a list entry for a to-do task.
 */
public class ListEntryTodo extends ListEntry {

    public ListEntryTodo(String task, boolean check) {
        super(task, check, TYPE_TODO);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
