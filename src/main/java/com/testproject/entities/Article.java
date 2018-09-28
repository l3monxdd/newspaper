package com.testproject.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String text;

    @Enumerated(EnumType.STRING)
    private Color color = Color.BLUE;

    @ManyToOne()
    @JoinColumn(name = "user_id")
    @JsonBackReference
    private User user;
}
