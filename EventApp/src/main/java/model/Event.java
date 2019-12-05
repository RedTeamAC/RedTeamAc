package model;

public class Event extends AbstractEntity {

    private EventType type;
    private int minAttendance;
    private int maxAttendance;
    private int description;

    public EventType getType() {
        return type;
    }

    public int getMinAttendance() {
        return minAttendance;
    }

    public int getMaxAttendance() {
        return maxAttendance;
    }

    public int getDescription() {
        return description;
    }

    public void setType(EventType type) {
        this.type = type;
    }

    public void setMinAttendance(int minAttendance) {
        this.minAttendance = minAttendance;
    }

    public void setMaxAttendance(int maxAttendance) {
        this.maxAttendance = maxAttendance;
    }

    public void setDescription(int description) {
        this.description = description;
    }
}
