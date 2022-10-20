package com.psuti.Vasilev.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "kindes")
public class Kind implements Serializable {
    @Id
    @Column(name = "kind", nullable = false)
    private String name;
}
