package com.psuti.Vasilev.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "animals")
public class Animal implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private UUID id;
    @Column(nullable = false, length = 25,name = "animal_name")
    private String animal_name;
    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "kind")
    private Kind kind;

}
