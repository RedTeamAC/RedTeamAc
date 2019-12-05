package org.academiadecodigo.eventapp.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "user")
public class User extends AbstractEntity {

    private String email;
    private String password;
    @ManyToMany(
            fetch = FetchType.EAGER
    )
    private List<Event> userEvents = new ArrayList<>();

    public List<Event> getUserEvents() {
        return userEvents;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}'+ super.toString();
    }
}
