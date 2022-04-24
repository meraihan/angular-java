package com.hiring.hk.backend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Data
@Entity
@Table(name = "level")
@NoArgsConstructor
@AllArgsConstructor
public class Level implements Serializable {

    private static final long serialVersionUID = -3777160902809687228L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String levelName;
}
