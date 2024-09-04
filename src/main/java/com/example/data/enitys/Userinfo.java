package com.example.data.enitys;


import jakarta.persistence.*;

@Entity
public class Userinfo {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    public String name ;
    public String email;
    public String phone;

    public Userinfo() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
