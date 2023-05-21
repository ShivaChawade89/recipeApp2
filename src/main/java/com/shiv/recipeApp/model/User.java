package com.shiv.recipeApp.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;
    @Pattern(regexp = "[A-Z ]*")
    private String userName;
    @Column(name = "password",nullable = false)
    private String password;
    private String comment;

    @ManyToOne
    private Recipe recipe;
}
