package com.example.crud.user;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GeneratetionType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(email = "email")
    private String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
