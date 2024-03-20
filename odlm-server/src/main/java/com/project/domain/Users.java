package com.project.domain;


import jakarta.persistence.*;
import lombok.*;


@Entity
@Getter @Setter

public class Users {

    @Id
    @Column(name = "student_id")
    private Long id;

    public Users(){

    }

    @Column
    private String email;
    private String password;
    private String name;

    @Enumerated(EnumType.STRING)
    private Grade grade; //LOW, MIDDLE, HIGH



}