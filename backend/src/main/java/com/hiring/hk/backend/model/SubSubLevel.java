package com.hiring.hk.backend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "sub_sub_level")
@NoArgsConstructor
@AllArgsConstructor
public class SubSubLevel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String subSubLevelName;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "sub_level_id")
    private SubLevel subLevel;
}
