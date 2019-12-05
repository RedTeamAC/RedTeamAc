package org.academiadecodigo.eventapp.dto;

import org.academiadecodigo.eventapp.model.EventType;

public class EventDto {

    private Integer id;
    private String name;
    private String location;
    private String contact;
    private EventType type;
    private Integer minAttendance;
    private Integer maxAttendance;
    private String description;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getContact() {
        return contact;
    }

    public EventType getType() {
        return type;
    }

    public Integer getMinAttendance() {
        return minAttendance;
    }

    public Integer getMaxAttendance() {
        return maxAttendance;
    }

    public String getDescription() {
        return description;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setType(EventType type) {
        this.type = type;
    }

    public void setMinAttendance(Integer minAttendance) {
        this.minAttendance = minAttendance;
    }

    public void setMaxAttendance(Integer maxAttendance) {
        this.maxAttendance = maxAttendance;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "EventDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", contact='" + contact + '\'' +
                ", type=" + type +
                ", minAttendance=" + minAttendance +
                ", maxAttendance=" + maxAttendance +
                ", description='" + description + '\'' +
                '}';
    }
}
