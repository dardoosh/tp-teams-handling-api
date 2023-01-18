package com.example.demo.Entity;
import lombok.Data;
import jakarta.persistence.*;
import jdk.jfr.DataAmount;

@Data

@Entity
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String name;
    private String slogan;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public Team() {

    }

    public Long getId() {
        return id;
    }


    public Team(String name, String slogan,Long id) {
        this.name = name;
        this.slogan = slogan;
        this.id=id;
    }
}
