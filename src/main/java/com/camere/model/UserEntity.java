package com.camere.model;

import jakarta.persistence.*;

@Entity
@Table(schema = "users")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Basic
    @Column(name = "nome")
    private String nome;

    @Basic
    @Column(name = "email")
    private String email;

    @Basic
    @Column(name = "hometown")
    private String hometown;

    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", hometown='" + hometown + '\'' +
                '}';
    }
}
