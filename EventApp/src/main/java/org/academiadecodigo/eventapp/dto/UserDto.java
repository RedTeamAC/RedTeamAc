package org.academiadecodigo.eventapp.dto;

import org.academiadecodigo.eventapp.model.LocationType;

import javax.validation.constraints.*;


public class UserDto {

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

    @Email
    private String email;

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

    public String getEmail() {
        return email;
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

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", contact='" + contact + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

}
