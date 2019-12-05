package org.academiadecodigo.eventapp.model;



import javax.persistence.*;

@Entity
@Table( name = "event")
public class Event extends AbstractEntity {

    private EventType type;
    private int minAttendance;
    private int maxAttendance;
    private String description;

    @OneToMany(

            cascade = {CascadeType.ALL},
            orphanRemoval = false,
            mappedBy = "event",
            fetch = FetchType.EAGER

    )

    public EventType getType() {
        return type;
    }

    public int getMinAttendance() {
        return minAttendance;
    }

    public int getMaxAttendance() {
        return maxAttendance;
    }

    public String getDescription() {
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

    public void setDescription(String description) {
        this.description = description;
    }
}
