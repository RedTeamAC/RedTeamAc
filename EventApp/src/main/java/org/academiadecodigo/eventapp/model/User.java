package org.academiadecodigo.eventapp.model;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User extends AbstractEntity {

    private  String email;
    

}
