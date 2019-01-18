package com.my.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Proxy;

@Entity
@Table(name = "user")
@Proxy(lazy = false)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String password;
    private String photo;
    private Integer age;
    private Integer phone;
    private String address;
    private String music;
    private String email;

    
    
    @Override
    public String toString() {
        return "User{" + "id=" + id + ", userName='" + name + '\'' + ", age=" + age + '}';
    }
}
