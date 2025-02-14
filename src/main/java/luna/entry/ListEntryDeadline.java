package luna.entry;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Represent a list entry for a deadline task.
 */
public class ListEntryDeadline extends ListEntry {
    public ListEntryDeadline(String task, boolean check, LocalDate tEnd) {
        super(task, check, TYPE_DEADLINE, tEnd);
    }

    @Override
    public String toString() {
        return super.toString() + " (by: " + this.taskEnd.format(DateTimeFormatter.ofPattern("d MMM yyyy")) + ")";
    }

    @Override
    public void snoozeEntry(int days) {
        this.taskEnd = taskEnd.plusDays(days);
    }

    @Override
    public boolean isSnoozable() {
        return true;
    }
}
