package org.academiadecodigo.eventapp.model;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User extends AbstractEntity {

    private String email;
    private String password;

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
}
