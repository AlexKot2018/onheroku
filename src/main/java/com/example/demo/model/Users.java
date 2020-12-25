package com.example.demo.model;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="surname")
    private String surname;
    @Column(name="nameuser")
    private String nameuser;
    @Column(name="phoneuser")
    private String phoneuser;
}
