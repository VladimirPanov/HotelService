package com.mystudy.hotelservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Room  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true)
    String number;

    @Column
    private String description;

    @Column
    private Boolean busy;

    //@OneToMany
    @Column
    private Visitor visitor;
}
