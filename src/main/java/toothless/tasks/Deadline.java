package toothless.tasks;

import java.time.LocalDateTime;

public class Deadline extends Task {
    private LocalDateTime date;

    public Deadline(String description, String date) {
        super.description = description;
        this.date = LocalDateTime.parse(date);
    }

    public Deadline(String description, String date, boolean isDone) {
        super.description = description;
        super.isDone = isDone;
        this.date = LocalDateTime.parse(date);
    }

    @Override
    public String getTaskIcon() {
        return "D";
    }

    @Override
    public String toWrite() {
        return "D | " + super.toWrite() + " | " + date;
    }

    @Override
    public String toString() {
        return description + " (by: "+ super.dateTimeFormat(date) + ")";
    }
}
