package org.academiadecodigo.eventapp.dto;

import org.academiadecodigo.eventapp.model.EventType;
import org.academiadecodigo.eventapp.model.LocationType;
import org.academiadecodigo.eventapp.model.User;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.validation.constraints.*;

import java.util.List;

public class EventDto {

    private Integer id;
    @NotNull(message = "first name is mandatory")
    @NotBlank(message = "first name is mandatory")
    @Size(min = 3, max = 64)
    private String name;

    @NotNull
    private LocationType location;

    @NotNull
    @Pattern(regexp = "^\\+?[0-9]*$", message = "phone has invalid characters")
    @Size(min = 9, max = 16)
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

    public LocationType getLocation() {
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

    public void setLocation(LocationType location) {
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
